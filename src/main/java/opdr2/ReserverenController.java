package opdr2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class ReserverenController extends SceneController {
    public Product product;

    @FXML private  Button overzicht;

    @FXML private TextField klant;

    @FXML private TextField prijs;

    @FXML private CheckBox verzekering;

    public void setProduct(Product prod){
        this.product = prod;
        setPrijs();
    }

    public void initialize(){
        overzicht.disableProperty().bind(klant.textProperty().isEmpty());
    }

    public void setPrijs(){
        double berkening = product.prijsPerDag(verzekering.isSelected());
        prijs.setText(Double.toString(berkening));
    }

    @Override
    public void handle(ActionEvent event) {
        this.product.setVerhuurInformatie(new VerhuurInformatie(medewerker, new Klant(klant.getText()), verzekering.isSelected()));
        Observable.update();
        super.handle(event);
    }
}
