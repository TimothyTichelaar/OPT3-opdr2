package opdr2;

public class VrachtautoFactory extends ProductFactory{
@Override
public Product maakProduct() {
        ProductInformatie productInformatie = new ProductInformatie("Vrachtauto", 0, 0);
        return new Vrachtauto(productInformatie);
        }
}
