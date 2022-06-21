package opdr2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class SceneController implements EventHandler<ActionEvent> {
    public static List<Medewerker> ingelogd = new ArrayList();

    public Medewerker medewerker;



    public void setMedewerker(Medewerker newMedewerker){this.medewerker = newMedewerker;}

    public static boolean checkIngelogd(Medewerker medewerker){
        return ingelogd.contains(medewerker);
    }

    @Override
    public void handle(ActionEvent event) {

        String stageName = ((Node)event.getSource()).getId();
        Parent root = null;
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(SceneController.class.getResource(stageName + "-view.fxml")));
        try {
            root = loader.load();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SceneController controller = loader.getController();
        controller.setMedewerker(medewerker);
        Observable.addObserver(controller);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        String scherm = stageName.substring(0,1).toUpperCase() + stageName.substring(1);
        stage.setTitle("Rent-a-Thing // " + scherm + "        " +  medewerker.getNaam());
        stage.setScene(scene);
        stage.setOnCloseRequest( e -> Observable.deleteObserver(controller) );
        stage.show();
    }

    public void update(){}
}
