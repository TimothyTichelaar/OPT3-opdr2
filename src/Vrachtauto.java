public class Vrachtauto extends Product{
    //Instance variabelen
    final private int laadvermogen;
    final private int gewicht;


    //Constructor
    public Vrachtauto (int laadvermogen, int gewicht, double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        super(huurprijsPerDag, verzekeringPerDag, verhuurd);
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
    }

    //Get methoden
    public int getLaadvermogen () {
        return this.laadvermogen;
    }

    public int getGewicht () {
        return this.gewicht;
    }

    public double getHuurprijsPerDag() {
        return super.getHuurprijsPerDag();
    }

    public double getVerzekeringPerDag() {
        return super.getVerzekeringPerDag();
    }

    public boolean getVerhuurd() { return super.getVerhuurd(); }

    //Set methoden

    public void setHuurprijsPerDag(double huurprijsPerDag) {
        super.setHuurprijsPerDag(huurprijsPerDag);
    }

    public void setVerzekeringPerDag(double verzekeringPerDag) {
        super.setVerzekeringPerDag(verzekeringPerDag);
    }

    public void setVerhuurd(boolean verhuren) {
        super.setVerhuurd(verhuren);
    }

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering, int leeftijd) {
        return 0;
    }
}
