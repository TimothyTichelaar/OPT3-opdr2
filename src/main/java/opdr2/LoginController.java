package opdr2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class LoginController extends SceneController {
    @FXML private Button menu;

    @FXML private TextField code;

    @FXML private TextField wachtwoord;

    @FXML private Label foutmeldingLabel;

    @Override
    public void handle (ActionEvent actionEvent)
    {
        String inlogCode = code.getText();
        Medewerker medewerker = PersonenOpslag.getMedewerker(inlogCode);
        if(PersonenOpslag.checkInlog(inlogCode, wachtwoord.getText()) && !SceneController.checkIngelogd(medewerker)){
            SceneController.ingelogd.add(medewerker);
            Stage stage = new Stage();
            new MenuApplication (medewerker);
            foutmeldingLabel.setVisible(false);
        }else{
            foutmeldingLabel.setVisible(true);
        }
    }
}