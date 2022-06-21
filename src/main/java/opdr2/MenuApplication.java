package opdr2;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuApplication extends Stage {

    private LoginApplication login;
    private Medewerker medewerker;
    private Pane rootPane;
    public MenuApplication (LoginApplication login, Medewerker medewerker) {
        this.medewerker = medewerker;
        FXMLLoader parent = new FXMLLoader(MenuApplication.class.getResource("menu-view.fxml"));
        //parent.getController().
        Scene scene = null;
        try {
            scene = new Scene(parent.load(), 850, 550);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

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
