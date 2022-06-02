package opdr2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;

public class LoginController implements EventHandler<ActionEvent> {
    public Button menu;
    public Button overzicht;

    final private LoginApplication login;

    public LoginController(){
        login = null;
    }

    public LoginController (LoginApplication login)
    {
        this.login = login;
    }

    @Override
    public void handle (ActionEvent actionEvent)
    {
        new MenuApplication (this.login);
    }
}