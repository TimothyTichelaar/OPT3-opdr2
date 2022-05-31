public class Personenauto implements Product{
    //Instance variabelen
    final private double standaardHuur = 50;
    final private double standaardVerzekering = 0.01;
    final private String merk;
    private int gewicht;
    private double huurprijsPerDag;
    private double verzekeringPerDag;
    private boolean verhuurd;

    //Constructor
    public Personenauto (String merk, int gewicht) {
        this.merk = merk;
        this.gewicht = gewicht;
        this.huurprijsPerDag = this.standaardHuur;
        this.verzekeringPerDag = this.standaardVerzekering * gewicht;
        this.verhuurd = false;
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
