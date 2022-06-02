package opdr2;

public class Personenauto extends Product{
    //Instance variabelen
    private String merk;
    private int gewicht;


    //Constructors
    public Personenauto(){
        this.huurprijsPerDag = 0;
        this.verzekeringPerDag = 0;
        this.verhuurd = false;
        this.merk = "";
        this.gewicht = 0;
    }
    public Personenauto (String merk, int gewicht, double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
        this.verhuurd = verhuurd;
        this.merk = merk;
        this.gewicht = gewicht;
    }

    //Get methoden
    public String getMerk () {
        return this.merk;
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
    public void setMerk(String merk) {
        this.merk = merk;
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
