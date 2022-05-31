public class PersonenautoFactory extends ProductFactory{
    @Override
    public Product maakProduct() {
        return new Personenauto();
    }
}
