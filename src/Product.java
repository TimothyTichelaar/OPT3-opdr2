public abstract class Product {
    //-----Instance variabelen-----
    private double huurprijsPerDag;
    private double verzekeringPerDag;
    private boolean verhuurd;

    //-----Constructor-----
    public Product (double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
        this.verhuurd = verhuurd;
    }

    //-----Get methoden-----
    public double getHuurprijsPerDag() {
        return this.huurprijsPerDag;
    }

    public double getVerzekeringPerDag() {
        return this.verzekeringPerDag;
    }

    public boolean getVerhuurd() { return this.verhuurd; }

    //-----Set methoden
    public void setHuurprijsPerDag(double huurprijsPerDag) {
        this.huurprijsPerDag = huurprijsPerDag;
    }

    public void setVerzekeringPerDag(double verzekeringPerDag) {
        this.verzekeringPerDag = verzekeringPerDag;
    }

    public void setVerhuurd(boolean verhuren) {
        this.verhuurd = verhuren;
    }

    //-----Overige methoden-----
    abstract double prijsPerDag(boolean verzekering, int leeftijd);
}
