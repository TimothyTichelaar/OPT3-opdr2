package opdr2;

public class PersonenautoFactory extends ProductFactory{
    @Override
    public Product maakProduct() {
        ProductInformatie productInformatie = new ProductInformatie("Personenauto", 0, 0);
        return new Personenauto(productInformatie);
    }
}
