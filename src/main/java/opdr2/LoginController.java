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

    final private LoginApplication login;

    private final List<String> ingelogd = new ArrayList();

    public LoginController(){
        this(null);
    }

    public LoginController (LoginApplication login)
    {
        this.login = login;
        foutmeldingLabel.setVisible(false);
    }

    @Override
    public void handle (ActionEvent actionEvent)
    {
        String inlogCode = code.getText();
        if(PersonenOpslag.checkInlog(inlogCode, wachtwoord.getText())){
            ingelogd.add(inlogCode);
            Stage stage = new Stage();
            new MenuApplication (stage, PersonenOpslag.getMedewerker(inlogCode));
            foutmeldingLabel.setVisible(false);

            stage.setOnCloseRequest( e -> ingelogd.remove(inlogCode));
        }else{
            foutmeldingLabel.setVisible(true);
        }
    }
}