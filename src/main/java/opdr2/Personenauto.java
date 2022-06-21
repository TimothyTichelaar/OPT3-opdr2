package opdr2;

public class Personenauto extends Product{
    //Instance variabelen
    private String merk;
    private int gewicht;


    //Constructors
    public Personenauto(){
        this("", 0, null);
    }

    public Personenauto (String merk, int gewicht, ProductInformatie productInformatie) {
        this.merk = merk;
        this.gewicht = gewicht;
        this.uniekeInfo1 = "merk";
        this.uniekeInfo2 = "gewicht";
        this.beschrijving = "Een personenauto van het merk " + merk + ". Het heeft een gewicht van " + gewicht + "kg.";
        this.productInformatie = productInformatie;
        this.verhuurInformatie = null;
    }

    //Get methoden
    public String getMerk () {
        return this.merk;
    }

    public int getGewicht () {
        return this.gewicht;
    }

    public String getBeschrijving(){return this.beschrijving;}

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
            return productInformatie.getHuurprijsPerDag() + productInformatie.getVerzekeringPerDag();
        }
        return productInformatie.getHuurprijsPerDag() ;
    }
}
