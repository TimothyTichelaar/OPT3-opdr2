public class BoormachineFactory extends ProductFactory{
    @Override
    public Product maakProduct() {
        return new Boormachine("", "", 0, 0, false);
    }
}
