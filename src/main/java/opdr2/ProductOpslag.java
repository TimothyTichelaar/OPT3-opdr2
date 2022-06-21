package opdr2;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;
import java.util.List;

public abstract class ProductOpslag {
    public static List<Product> producten = new ArrayList();
    public static List<String> productSoorten = new ArrayList();

    public static void initialize(){
        productSoorten.add("Personenauto");
        productSoorten.add("Vrachtauto");
        productSoorten.add("Boormachine");

        //producten.add(new Personenauto());
        ProductInformatie auto1 = new ProductInformatie("Personenauto BMW", 50, 5);
        producten.add(new Personenauto("BMW", 1500, auto1));

        ProductInformatie auto2 = new ProductInformatie("Personenauto Audi", 30, 4);
        Product audi = new Personenauto("Audi", 1700, auto2);
        audi.setVerhuurInformatie(new VerhuurInformatie(PersonenOpslag.getMedewerkers().get(0), new Klant("Noah Albin"), true));
        producten.add(audi);

        ProductInformatie auto3 = new ProductInformatie("Personenauto Volkswagen", 45, 5);
        producten.add(new Personenauto("volkswagen", 1300, auto3));
    }

    public static void addProduct(Product product){
        producten.add(product);
    }

    public static List<Product> getProducten(){
        return producten;
    }

    public static List<String> getProductSoorten() {return productSoorten;}

}
