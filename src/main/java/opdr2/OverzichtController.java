package opdr2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class OverzichtController extends SceneController {

    @FXML private TableView<Product> producten;

    @FXML private TableColumn<Product, String> column1;

    @FXML private TableColumn<Product, String> column2;

    @FXML private TableColumn<Product, Boolean> column3;


    public void initialize(){
        ObservableList<Product> data = FXCollections.observableArrayList(ProductOpslag.getProducten());

        column1.setCellValueFactory(new PropertyValueFactory<>("naam"));

        column2.setCellValueFactory(new PropertyValueFactory<>("beschrijving"));

        column3.setCellValueFactory(new PropertyValueFactory<>("verhuurd"));

        producten.setItems(data);

    }

    @Override
    public void update() {
       producten.getItems().removeAll();
       ObservableList<Product> data = FXCollections.observableArrayList(ProductOpslag.getProducten());
       producten.setItems(data);
       producten.refresh();
    }

    public void clickItem(MouseEvent event) {
        Product product = producten.getItems().get(producten.getSelectionModel().getSelectedCells().get(0).getRow());
        String stageName = "detail";
        Parent root;
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(OverzichtController.class.getResource(stageName + "-view.fxml")));
        DetailController controller;
        try {
            root = loader.load();
            controller = loader.getController();
            controller.setMedewerker(this.medewerker);
            controller.setProduct(product);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        String scherm = stageName.substring(0,1).toUpperCase() + stageName.substring(1);
        stage.setTitle("Rent-a-Thing // " + scherm + "        " +  this.medewerker.getNaam());
        stage.setScene(scene);
        stage.show();
    }

}
