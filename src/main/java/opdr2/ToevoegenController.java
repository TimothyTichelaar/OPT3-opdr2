package opdr2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ToevoegenController extends ProductInfoController{

    @FXML Label info1Label;

    @FXML Label info2Label;

    @FXML TextField productField;

    @FXML TextField info1Field;

    @FXML TextField info2Field;

    @FXML TextField dagprijsField;

    @FXML TextField verzekeringField;

    public void itemAanmaken (int productsoort) {
        product = ProductFactory.FACTORY_LIST.get(productsoort).maakProduct();
        info1Label.setText(product.productInformatie.getUniekeInfo1());
        info2Label.setText(product.productInformatie.getUniekeInfo2());
        productField.setText(product.getNaam());
    }

    @FXML
    private void setInfo(ActionEvent event){
        String info1 = info1Field.getText();
        String info2 = info2Field.getText();
        double dagprijs = Double.parseDouble(dagprijsField.getText());
        double verzekering = Double.parseDouble(verzekeringField.getText());
        ProductInformatie productInformatie = product.getProductInformatie();
        productInformatie.setHuurprijsPerDag(dagprijs);
        productInformatie.setVerzekeringPerDag(verzekering);
        product.setProductInformatie(productInformatie);
        product.setInformatie1(info1);
        product.setInformatie2(info2);
        ProductOpslag.addProduct(product);
        Observable.update();
        super.handle(event);
    }
}
