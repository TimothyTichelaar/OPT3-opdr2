public class Vrachtauto extends Product{
    //Instance variabelen
    private int laadvermogen;
    private int gewicht;


    //Constructor
    public Vrachtauto(){
        this.huurprijsPerDag = 0;
        this.verzekeringPerDag = 0;
        this.verhuurd = false;
        this.laadvermogen = 0;
        this.gewicht = 0;
    }

    public Vrachtauto (int laadvermogen, int gewicht, double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
        this.verhuurd = verhuurd;
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
        return this.huurprijsPerDag;
    }

    public double getVerzekeringPerDag() {
        return this.verzekeringPerDag;
    }

    public boolean getVerhuurd() { return this.verhuurd; }

    //Set methoden

    public void setLaadvermogen(int laadvermogen) {
        this.laadvermogen = laadvermogen;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

    public void setHuurprijsPerDag(double huurprijsPerDag) {
        this.huurprijsPerDag = huurprijsPerDag;
    }

    public void setVerzekeringPerDag(double verzekeringPerDag) {
        this.verzekeringPerDag = verzekeringPerDag;
    }

    public void setVerhuurd(boolean verhuren) {
        this.verhuurd = verhuren;
    }

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering, int leeftijd) {
        return 0;
    }
}
