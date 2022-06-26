package opdr2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ProductFactory {

    public static final List<ProductFactory> FACTORY_LIST = new ArrayList<>(Arrays.asList(
            new PersonenautoFactory(), new VrachtautoFactory(), new BoormachineFactory()
    ));

    public abstract Product maakProduct ();
}