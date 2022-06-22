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

public class DetailController extends ProductInfoController {
    @FXML private Label titel;

    @FXML private Label beschrijving;

    @FXML private AnchorPane reserveren;

    public void setProduct(Product product) {
        super.setProduct(product);
        setTitel();
        setBeschrijving();
        try {
            setReserveren();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

//    public void gerbuikProductInformatie() throws IOException {
//        setTitel();
//        setBeschrijving();
//        setReserveren();
//    }

    private void setTitel(){this.titel.setText(this.product.getProductInformatie().getNaam());}

    private void setBeschrijving(){this.beschrijving.setText(this.product.getBeschrijving());}

    private void setReserveren() throws IOException {
        String fxml = "reserveren.fxml";
        FXMLLoader loader = new FXMLLoader();
        if(this.product.getVerhuur() != null){
            fxml = "gereserveerd.fxml";
        }
        loader.setLocation(Objects.requireNonNull(getClass().getResource(fxml)));
        reserveren.getChildren().setAll((Node) loader.load());
        ProductInfoController controller = loader.getController();
        controller.setProduct(this.product);
        controller.setMedewerker(this.medewerker);
    }
}
