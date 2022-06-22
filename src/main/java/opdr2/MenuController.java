package opdr2;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MenuController extends SceneController {

    @FXML Button uitloggen;

    public void closeButtonAction(){
        SceneController.ingelogd.remove(medewerker);
        Stage stage = (Stage) uitloggen.getScene().getWindow();
        stage.close();
    }
}
