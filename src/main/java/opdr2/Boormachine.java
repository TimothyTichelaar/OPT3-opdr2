package opdr2;

public class Boormachine extends Product{
    //Instance variabelen
    private String merk;
    private String type;


    //Constructor
    public Boormachine (){
        this.naam = "Boormachine";
        this.huurprijsPerDag = 0;
        this.verzekeringPerDag = 0;
        this.verhuurd = false;
        this.merk = "";
        this.type = "";
        this.verhuurInformatie = null;
    }

    public Boormachine (String merk, String type, double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        this.naam = "Boormachine";
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
        this.verhuurd = verhuurd;
        this.merk = merk;
        this.type = type;
        this.beschrijving = "Een boormachine van het merk " + merk + ". Het is de  " + type + " uitvoering.";
        this.verhuurInformatie = null;
    }

    //Get methoden
    public String getMerk () {
        return this.merk;
    }

    public String getType () {
        return this.type;
    }

    //Set methoden

    public void setMerk(String merk) {
        this.merk = merk;
        setBeschrijving();
    }

    public void setType(String type) {
        this.type = type;
        setBeschrijving();
    }

    private void setBeschrijving(){
        this.beschrijving = "Een boormachine van het merk " + this.merk + ". Het is de  " + this.type + " uitvoering.";;
    }

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        return 0;
    }
}
