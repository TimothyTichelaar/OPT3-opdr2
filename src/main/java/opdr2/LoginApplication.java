package opdr2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginApplication extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        Repository.setData();
        FXMLLoader parent = new FXMLLoader(LoginApplication.class.getResource("login-view.fxml"));
        Scene scene = new Scene(parent.load(), 850, 550);
        stage.setTitle("Rent-a-Thing // login");
        stage.setScene(scene);
        stage.setAlwaysOnTop(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
