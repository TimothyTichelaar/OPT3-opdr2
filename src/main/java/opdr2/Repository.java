package opdr2;

public abstract class Repository {

    public static void setData(){
        setMedewerkers();
        setProductsoorten();
        setPersonenautos();
    }

    private static void setMedewerkers(){
        PersonenOpslag.addMedewerker(new Medewerker("Tim Tichelaar", "pnltt313", "wachtwoord"));
        PersonenOpslag.addMedewerker(new Medewerker("Noah Albin", "pnlna626", "qwerty"));
        PersonenOpslag.addMedewerker(new Medewerker("Daniel Tellez Pedrosa", "pnl04z5a", "zomer123"));
    }

    private static void setProductsoorten(){
        ProductOpslag.addProductSoort("Personenauto");
        ProductOpslag.addProductSoort("Vrachtauto");
        ProductOpslag.addProductSoort("Boormachine");
    }

    private static void setPersonenautos(){
        int huurprijs = 50;
        double verzekering = 0.01;
        int gewicht = 1500;
        ProductInformatie auto1 = new ProductInformatie("Personenauto BMW", huurprijs, verzekering);
        ProductOpslag.addProduct(new Personenauto("BMW", gewicht, auto1));

        gewicht = 1700;
        ProductInformatie auto2 = new ProductInformatie("Personenauto Audi", huurprijs, verzekering);
        Product audi = new Personenauto("Audi", gewicht, auto2);
        audi.setVerhuurInformatie(new VerhuurInformatie(PersonenOpslag.getMedewerkers().get(0), new Klant("Noah Albin"), true));
        ProductOpslag.addProduct(audi);

        gewicht = 1300;
        ProductInformatie auto3 = new ProductInformatie("Personenauto Volkswagen", huurprijs, verzekering);
        ProductOpslag.addProduct(new Personenauto("Volkswagen", gewicht, auto3));
    }
}
