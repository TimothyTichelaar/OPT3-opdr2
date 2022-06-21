package opdr2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController extends SceneController {
    @FXML
    private Button menu;

    @FXML private TextField code;

    @FXML private TextField wachtwoord;

    @FXML private Label foutmeldingLabel;

    final private LoginApplication login;

    public LoginController(){
        this(null);
    }

    public LoginController (LoginApplication login)
    {
        this.login = login;
        //foutmeldingLabel.setVisible(false);
    }

    @Override
    public void handle (ActionEvent actionEvent)
    {
        String inlogCode = "pnltt313";//code.getText();
        //if(PersonenOpslag.checkInlog(inlogCode, wachtwoord.getText())){
            new MenuApplication (this.login, PersonenOpslag.getMedewerker(inlogCode));
            //foutmeldingLabel.setVisible(false);
        //}else{
            //foutmeldingLabel.setVisible(true);
        //}
    }
}