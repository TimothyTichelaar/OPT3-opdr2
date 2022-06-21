package opdr2;

public abstract class Product {
    //-----Instance variabelen-----
    public String naam;
    public String beschrijving;
    public double huurprijsPerDag;
    public double verzekeringPerDag;
    public boolean verhuurd;
    public VerhuurInformatie verhuur;

    //-----Constructor-----

    //-----Get methoden-----
    public abstract String getNaam();

    public abstract String getBeschrijving();

    public abstract boolean getVerhuurd();

    public abstract VerhuurInformatie getVerhuur();

    //-----Set methoden
    public abstract void setVerhuurd(boolean verhuren);

    public abstract void setVerhuur(VerhuurInformatie verhuur);

    //-----Overige methoden-----
    abstract double prijsPerDag(boolean verzekering);
}
