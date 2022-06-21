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
                String stageName = "toevoegen";
                Parent root = null;
                try {

                    //DetailController.setProduct(product);
                    root = FXMLLoader.load(Objects.requireNonNull(OverzichtController.class.getResource(stageName + "-view.fxml")));
                    //DetailController.setProduct(product);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                Scene scene = new Scene(root);
                stage.setTitle("Rent-a-Thing // " + stageName.substring(0,1).toUpperCase() + stageName.substring(1));
                stage.setScene(scene);
                stage.show();
            }
        });
    }

    @Override
    public void handle(ActionEvent event) {

        String stageName = ((Node)event.getSource()).getId();
        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(MenuController.class.getResource(stageName + "-view.fxml")));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setTitle("Rent-a-Thing // " + stageName.substring(0,1).toUpperCase() + stageName.substring(1));
        stage.setScene(scene);
        stage.show();
    }
}
