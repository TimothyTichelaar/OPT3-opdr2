package opdr2;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MenuApplication extends Stage {

    private LoginApplication bowling;
    private Pane rootPane;
    public MenuApplication (LoginApplication bowling) {
        this.bowling = bowling;
        this.rootPane = new Pane();
        setTitle ("Status");
        this.rootPane.setMinSize (200, 200);
        draw ();
        Scene scene = new Scene (rootPane);
        setScene (scene);
        //setOnCloseRequest (new EventHandlerClose (bowling, this));
        show ();
    }

    public void draw () {

        this.rootPane.getChildren ().clear ();
        VBox vBox = new VBox ();
        this.rootPane.getChildren ().add (vBox);


    }
}
