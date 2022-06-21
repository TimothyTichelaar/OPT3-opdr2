package opdr2;

import javafx.fxml.FXMLLoader;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private static final List<SceneController> observers = new ArrayList<>();

    public static void addObserver(SceneController controller){
        observers.add(controller);
    }

    public static void deleteObserver(SceneController controller){
        observers.remove(controller);
    }

    public static void update(){
        for(int i = 0; i < observers.size(); i++){
            observers.get(i).update();
        }
    }
}
