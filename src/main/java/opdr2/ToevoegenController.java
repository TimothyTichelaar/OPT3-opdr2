package opdr2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ToevoegenController extends SceneController{
    private int productsoort;

    private Product item;

    @FXML Label info1Label;

    @FXML Label info2Label;

    @FXML TextField productField;

    @FXML TextField info1Field;

    @FXML TextField info2Field;

    @FXML TextField dagprijsField;

    @FXML TextField verzekeringField;

    public void setProductsoort(int productsoort){
        this.productsoort = productsoort;
        itemAanmaken();
        productField.setText(item.getNaam());
    }

    private void itemAanmaken () {
        //System.out.println(productsoort);
        if(productsoort == 0){
            item = ProductFactory.PERSONENAUTO_FACTORY.maakProduct();
        }if(productsoort == 1){
            item = ProductFactory.VRACHTAUTO_FACTORY.maakProduct();
        }if(productsoort == 2){
            item = ProductFactory.BOORMACHINE_FACTORY.maakProduct();
        }
        info1Label.setText(item.uniekeInfo1);
        info2Label.setText(item.uniekeInfo2);
    }

    @FXML
    private void setInfo(ActionEvent event){
        String info1 = info1Field.getText();
        String info2 = info2Field.getText();
        double dagprijs = Double.parseDouble(dagprijsField.getText());
        double verzekering = Double.parseDouble(verzekeringField.getText());
        ProductInformatie productInformatie = item.getProductInformatie();
        productInformatie.setHuurprijsPerDag(dagprijs);
        productInformatie.setVerzekeringPerDag(verzekering);
        item.setProductInformatie(productInformatie);
        item.setInformatie1(info1);
        item.setInformatie2(info2);
        ProductOpslag.addProduct(item);
        Observable.update();
        super.handle(event);
    }


}
