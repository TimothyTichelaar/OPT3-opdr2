public class VrachtautoFactory extends ProductFactory{
@Override
public Product maakProduct() {
        return new Vrachtauto(0,0,0,0,false);
        }
}
