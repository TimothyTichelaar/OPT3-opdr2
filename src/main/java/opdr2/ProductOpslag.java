package opdr2;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductOpslag {
    public static List<Product> producten = new ArrayList();
    public static List<String> productSoorten = new ArrayList();

    public static void addProduct(Product product){
        producten.add(product);
    }

    public static void addProductSoort(String productSoort){productSoorten.add(productSoort);}

    public static List<Product> getProducten(){
        return producten;
    }

    public static List<String> getProductSoorten() {return productSoorten;}

}
