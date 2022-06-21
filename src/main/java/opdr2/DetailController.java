package opdr2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class DetailController extends SceneController {
    private Product product;
    @FXML private Label titel;

    @FXML private Label beschrijving;

    @FXML private AnchorPane reserveren;

    public void setProduct(Product product) throws IOException {
        this.product = product;
        setTitel();
        setBeschrijving();
        setReserveren();
    }

//    public void gerbuikProductInformatie() throws IOException {
//        setTitel();
//        setBeschrijving();
//        setReserveren();
//    }

    private void setTitel(){this.titel.setText(this.product.getProductInformatie().getNaam());}

    private void setBeschrijving(){this.beschrijving.setText(this.product.getBeschrijving());}

    private void setReserveren() throws IOException {
        //String fxml = "reserveren.fxml";
        FXMLLoader loader = new FXMLLoader();
        if(this.product.getVerhuur() != null){
            loader.setLocation(Objects.requireNonNull(getClass().getResource("gereserveerd.fxml")));
            reserveren.getChildren().setAll((Node) loader.load());
            GereserveerdController controller = loader.getController();
            controller.setProduct(this.product);
            controller.setMedewerker(this.medewerker);

        }else{
            loader.setLocation(Objects.requireNonNull(getClass().getResource("reserveren.fxml")));
            reserveren.getChildren().setAll((Node) loader.load());
            ReserverenController controller = loader.getController();
            controller.setProduct(this.product);
            controller.setMedewerker(this.medewerker);
        }
    }
}
