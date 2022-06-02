package opdr2;

public abstract class ProductFactory {
    public static final PersonenautoFactory PERSONENAUTO_FACTORY = new PersonenautoFactory();
    public static final VrachtautoFactory VRACHTAUTO_FACTORY = new VrachtautoFactory();
    public static final BoormachineFactory BOORMACHINE_FACTORY = new BoormachineFactory();

    public abstract Product maakProduct ();
}
