package opdr2;

public class BoormachineFactory extends ProductFactory{
    @Override
    public Product maakProduct() {
        return new Boormachine();
    }
}
