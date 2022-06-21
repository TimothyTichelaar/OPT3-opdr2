package opdr2;

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
        this.verhuur = null;
    }

    public Vrachtauto (int laadvermogen, int gewicht, double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
        this.verhuurd = verhuurd;
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
        this.verhuur = null;
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

    public VerhuurInformatie getVerhuur() {return this.verhuur;}

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

    @Override
    public String getNaam() {
        return this.naam;
    }

    @Override
    public String getBeschrijving() {
        return this.beschrijving;
    }

    public void setVerhuur(VerhuurInformatie verhuur){this.verhuur = verhuur;}

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        return 0;
    }
}
