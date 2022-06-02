package opdr2;

public class PersonenautoFactory extends ProductFactory{
    @Override
    public Product maakProduct() {
        return new Personenauto();
    }
}
