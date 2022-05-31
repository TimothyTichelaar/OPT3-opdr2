public class Personenauto extends Product{
    //Instance variabelen
    final private String merk;
    final private int gewicht;


    //Constructor
    public Personenauto (String merk, int gewicht, double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        super(huurprijsPerDag, verzekeringPerDag, verhuurd);
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
