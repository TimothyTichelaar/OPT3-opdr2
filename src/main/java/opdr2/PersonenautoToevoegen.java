package opdr2;

public class PersonenautoToevoegen extends ItemToevoegen{

    public PersonenautoToevoegen(){
        super();
        getProductInformatie(addProduct());
    }

    @Override
    public void getProductInformatie(Product product) {

    }

    @Override
    public Product addProduct() {
        return ProductFactory.PERSONENAUTO_FACTORY.maakProduct();
    }
}
