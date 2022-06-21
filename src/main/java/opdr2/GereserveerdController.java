package opdr2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GereserveerdController extends SceneController {

    @FXML private TextField medewerkerfield;

    @FXML private TextField klant;

    private Product product;

    public void setProduct(Product prod){
        this.product = prod;
        medewerkerfield.setText(product.getVerhuur().getMedewerker().getNaam());
        klant.setText(product.getVerhuur().getKlant().getNaam());
    }


    @Override
    public void handle(ActionEvent event) {
        this.product.setVerhuurd(false);
        this.product.setVerhuur(null);
        Observable.update();
        super.handle(event);
    }
}
