public abstract class Product {
    //-----Instance variabelen-----
    public double huurprijsPerDag;
    public double verzekeringPerDag;
    public boolean verhuurd;

    //-----Constructor-----

    //-----Get methoden-----

    //-----Set methoden

    //-----Overige methoden-----
    abstract double prijsPerDag(boolean verzekering, int leeftijd);
}
