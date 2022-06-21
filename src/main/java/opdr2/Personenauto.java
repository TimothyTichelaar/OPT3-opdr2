package opdr2;

public class Personenauto extends Product{
    //Instance variabelen
    private String merk;
    private int gewicht;


    //Constructors
    public Personenauto(){
        this("", 0, 0, 0, false);
    }

    public Personenauto (String merk, int gewicht, double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        this.naam = "Personenauto";
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
        this.verhuurd = verhuurd;
        this.merk = merk;
        this.gewicht = gewicht;
        this.beschrijving = "Een personenauto van het merk " + merk + ". Het heeft een gewicht van " + gewicht + "kg.";
        this.verhuurInformatie = null;
    }

    //Get methoden
    public String getMerk () {
        return this.merk;
    }

    public int getGewicht () {
        return this.gewicht;
    }

    //Set methoden
    public void setMerk(String merk) {
        this.merk = merk;
        setBeschrijving();
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
        setBeschrijving();
    }

    private void setBeschrijving(){
        this.beschrijving = "Een personenauto van het merk " + this.merk + ". Het heeft een gewicht van " + this.gewicht + "kg.";
    }


    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        if(verzekering){
            return this.huurprijsPerDag + this.verzekeringPerDag;
        }
        return this.huurprijsPerDag;
    }
}
