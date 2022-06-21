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

        producten.add(new Personenauto());
        producten.add(new Personenauto("bmw", 1500, 50, 5, false));
        Product audi = new Personenauto("audi", 1700, 30, 4, true);
        audi.setVerhuurInformatie(new VerhuurInformatie(PersonenOpslag.getMedewerkers().get(0), new Klant("Noah Albin"), true));
        producten.add(audi);
        producten.add(new Personenauto("volkswagen", 1300, 45, 5, false));
    }

    public static void addProduct(){
        producten.add(ProductFactory.PERSONENAUTO_FACTORY.maakProduct());
    }

    public static List<Product> getProducten(){
        return producten;
    }

    public static List<String> getProductSoorten() {return productSoorten;}

}
