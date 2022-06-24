package opdr2;

public abstract class Repository {

    public static void setData(){
        setMedewerkers();
        setProductsoorten();
        setPersonenautos();
        setVrachtautos();
        setBoormachines();
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
        String productNaam = "Personenauto";
        double huurprijs = 50;
        double verzekering = 0.01;
        int gewicht = 1500;
        ProductInformatie auto1 = new ProductInformatie(productNaam, huurprijs, verzekering);
        ProductOpslag.addProduct(new Personenauto("BMW", gewicht, auto1));

        gewicht = 1700;
        ProductInformatie auto2 = new ProductInformatie(productNaam, huurprijs, verzekering);
        Product audi = new Personenauto("Audi", gewicht, auto2);
        audi.setVerhuurInformatie(new VerhuurInformatie(PersonenOpslag.getMedewerkerLijst().get(0), new Klant("Noah Albin"), true));
        ProductOpslag.addProduct(audi);

        gewicht = 1300;
        ProductInformatie auto3 = new ProductInformatie(productNaam, huurprijs, verzekering);
        ProductOpslag.addProduct(new Personenauto("Volkswagen", gewicht, auto3));
    }

    private static void setVrachtautos(){
        String productNaam = "Vrachtauto";
        double huurprijs = 0.10;
        double verzekering = 0.01;
        int laadvermogen = 1000;
        int gewicht = 3000;

        ProductInformatie vrachtauto1 = new ProductInformatie(productNaam, huurprijs, verzekering);
        ProductOpslag.addProduct(new Vrachtauto(laadvermogen, gewicht, vrachtauto1));

        laadvermogen = 600;
        gewicht = 2500;
        ProductInformatie vrachtauto2 = new ProductInformatie(productNaam, huurprijs, verzekering);
        ProductOpslag.addProduct(new Vrachtauto(laadvermogen, gewicht, vrachtauto2));

        laadvermogen = 500;
        gewicht = 2000;
        ProductInformatie vrachtauto3 = new ProductInformatie(productNaam, huurprijs, verzekering);
        Product newVrachtauto = new Vrachtauto(laadvermogen, gewicht, vrachtauto3);
        newVrachtauto.setVerhuurInformatie(new VerhuurInformatie(PersonenOpslag.getMedewerkerLijst().get(1), new Klant("Jantje"), false));
        ProductOpslag.addProduct(newVrachtauto);
    }

    private static void setBoormachines(){
        String productNaam = "Boormachine";
        double huurprijs = 5;
        double verzekering = 1;

        ProductInformatie boormachine1 = new ProductInformatie(productNaam, huurprijs, verzekering);
        ProductOpslag.addProduct(new Boormachine("Bosch", "Turbo", boormachine1));

        ProductInformatie boormachine2 = new ProductInformatie(productNaam, huurprijs, verzekering);
        ProductOpslag.addProduct(new Boormachine("Bosch", "Nitro", boormachine2));

        ProductInformatie boormachine3 = new ProductInformatie(productNaam, huurprijs, verzekering);
        Boormachine newBoormachine = new Boormachine("Bosch", "Nitro", boormachine3);
        newBoormachine.setVerhuurInformatie(new VerhuurInformatie(PersonenOpslag.getMedewerkerLijst().get(2), new Klant("Hans"), true));
        ProductOpslag.addProduct(newBoormachine);

    }
}
