package opdr2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MenuController extends SceneController {

    public javafx.scene.control.Button uitloggen;

    public void closeButtonAction(ActionEvent actionEvent){
        SceneController.ingelogd.remove(medewerker);
        Stage stage = (Stage) uitloggen.getScene().getWindow();
        stage.close();
    }
}
