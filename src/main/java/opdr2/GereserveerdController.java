package opdr2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class GereserveerdController extends ProductInfoController {

    @FXML private Label medewerkerfield;

    @FXML private Label klant;

    @Override
    public void setProduct(Product prod){
        super.setProduct(prod);
        medewerkerfield.setText(product.getVerhuur().getMedewerker().getNaam());
        klant.setText(product.getVerhuur().getKlant().getNaam());
    }


    @Override
    public void handle(ActionEvent event) {
        this.product.setVerhuurInformatie(null);
        Observable.update();
        super.handle(event);
    }
}
