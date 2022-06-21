package opdr2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ToevoegenController extends SceneController{
    private String productsoort;

    private Product item;

    @FXML Label info1Label;

    @FXML Label info2Label;

    @FXML TextField productField;

    @FXML TextField info1Field;

    @FXML TextField info2Field;

    @FXML TextField dagprijsField;

    @FXML TextField verzekeringField;

    public void setProductsoort(String productsoort){
        this.productsoort = productsoort;
        productField.setText(productsoort);
        itemAanmaken();
    }

    private void itemAanmaken () {
        if(productsoort.equals("Personenauto")){
            item = ProductFactory.PERSONENAUTO_FACTORY.maakProduct();
        }if(productsoort.equals("Vrachtnauto")){
            item = ProductFactory.VRACHTAUTO_FACTORY.maakProduct();
        }if(productsoort.equals("Boormachine")){
            item = ProductFactory.BOORMACHINE_FACTORY.maakProduct();
        }
        info1Label.setText(item.uniekeInfo1);
        info2Label.setText(item.uniekeInfo2);
    }

    public void setInfo(){
        String naam = productField.getText();
        String info1 = info1Field.getText();
        String info2 = info2Field.getText();
        double dagprijs = Double.parseDouble(dagprijsField.getText());
        double verzekering = Double.parseDouble(verzekeringField.getText());
        ProductInformatie productInformatie = new ProductInformatie(naam, dagprijs, verzekering);
        item.setProductInformatie(productInformatie);
        item.setInformatie1(info1);
        item.setInformatie2(info2);
        ProductOpslag.addProduct(item);
    }

    @Override
    public void handle(ActionEvent event) {
        setInfo();
        super.handle(event);
    }
}
