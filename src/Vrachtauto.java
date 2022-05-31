public class Vrachtauto extends Product{
    //Instance variabelen
    private int laadvermogen;
    private int gewicht;


    //Constructor
    public Vrachtauto(){
        super(0, 0, false);
        this.laadvermogen = 0;
        this.gewicht = 0;
    }

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

    public void setLaadvermogen(int laadvermogen) {
        this.laadvermogen = laadvermogen;
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
    }

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
