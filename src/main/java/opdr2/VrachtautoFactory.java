package opdr2;

public class VrachtautoFactory extends ProductFactory{
@Override
public Product maakProduct() {
        return new Vrachtauto();
        }
}
