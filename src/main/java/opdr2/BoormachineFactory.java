package opdr2;

public class BoormachineFactory extends ProductFactory{
    @Override
    public Product maakProduct() {
        ProductInformatie productInformatie = new ProductInformatie("Boormachine", 0, 0);
        return new Boormachine(productInformatie);
    }
}
