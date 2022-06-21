package opdr2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ToevoegenController extends SceneController{
    private String productsoort;

    private ItemToevoegen item;

    @FXML Label info1Label;

    @FXML Label info2Label;

    public void setProductsoort(String productsoort){
        this.productsoort = productsoort;
    }

    public void itemAanmaken () {
        if(productsoort.equals("Personenauto")){
            item = new PersonenautoToevoegen();
        }
    }

    public void setInfo(){

    }
}
