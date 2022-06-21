package opdr2;

public class PersonenautoToevoegen extends ItemToevoegen{

    public PersonenautoToevoegen(){
        super();
    }



    @Override
    public Product addProduct() {
        return ProductFactory.PERSONENAUTO_FACTORY.maakProduct();
    }
}
