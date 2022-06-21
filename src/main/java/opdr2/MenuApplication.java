package opdr2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuApplication extends Stage {

    private LoginApplication login;
    private Pane rootPane;
    public MenuApplication (LoginApplication login, Medewerker medewerker) {
        FXMLLoader parent = new FXMLLoader(MenuApplication.class.getResource("menu-view.fxml"));
        Scene scene = null;
        try {
            scene = new Scene(parent.load(), 850, 550);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SceneController controller = parent.getController();
        controller.setMedewerker(medewerker);

        Stage stage = new Stage();
        stage.setTitle("Rent-a-Thing // Menu        " + medewerker.getNaam());
        stage.setScene(scene);
        stage.setAlwaysOnTop(false);
        stage.show();
    }

    public void update () {

        this.rootPane.getChildren ().clear ();
        VBox vBox = new VBox ();
        this.rootPane.getChildren ().add (vBox);


    }
}
