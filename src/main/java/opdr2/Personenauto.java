package opdr2;

public class Personenauto extends Product{
    //Instance variabelen
    private String merk;
    private int gewicht;


    //Constructors
    public Personenauto(){
        this.naam = "Personenauto";
        this.huurprijsPerDag = 0;
        this.verzekeringPerDag = 0;
        this.verhuurd = false;
        this.merk = "";
        this.gewicht = 0;
        this.beschrijving = "Een personenauto van het merk " + merk + ". Het heeft een gewicht van " + gewicht + "kg.";
        this.verhuur = null;
    }
    public Personenauto (String merk, int gewicht, double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        this.naam = "Personenauto";
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
        this.verhuurd = verhuurd;
        this.merk = merk;
        this.gewicht = gewicht;
        this.beschrijving = "Een personenauto van het merk " + merk + ". Het heeft een gewicht van " + gewicht + "kg.";
        this.verhuur = null;
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
    public String getNaam (){
        return this.naam;
    }
    public String getBeschrijving(){
        return this.beschrijving;
    }

    public VerhuurInformatie getVerhuur() {return this.verhuur;}

    //Set methoden
    public void setMerk(String merk) {
        this.merk = merk;
        setBeschrijving();
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
        setBeschrijving();
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

    public void setNaam(String naam) { this.naam = naam;}

    public void setBeschrijving(){
        this.beschrijving = "Een personenauto van het merk " + this.merk + ". Het heeft een gewicht van " + this.gewicht + "kg.";
    }

    public void setVerhuur(VerhuurInformatie verhuur){this.verhuur = verhuur;}

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        if(verzekering){
            return this.huurprijsPerDag + this.verzekeringPerDag;
        }
        return this.huurprijsPerDag;
    }
}
