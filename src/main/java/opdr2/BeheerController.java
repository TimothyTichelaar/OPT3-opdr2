package opdr2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class BeheerController extends SceneController {

    @FXML ListView producten;

    public void initialize(){
        ObservableList<String> items = FXCollections.observableArrayList (ProductOpslag.getProductSoorten());
        producten.setItems(items);
    }

    public void clickItem(MouseEvent event) {
        producten.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                String product = String.valueOf(producten.getSelectionModel().getSelectedItems());
                product = product.substring(1,product.length()-1);
                String stageName = "toevoegen";
                Parent root = null;
                FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(OverzichtController.class.getResource(stageName + "-view.fxml")));
                try {
                    root = loader.load();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                ToevoegenController controller = loader.getController();
                controller.setMedewerker(medewerker);
                controller.setProductsoort(product);
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                String scherm = stageName.substring(0,1).toUpperCase() + stageName.substring(1);
                stage.setTitle("Rent-a-Thing // " + scherm + "        " +  medewerker.getNaam());
                stage.setScene(scene);
                stage.show();
            }
        });
    }
}
