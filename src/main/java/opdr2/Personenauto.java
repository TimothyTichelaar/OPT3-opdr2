package opdr2;

public class Personenauto extends Product{
    //Instance variabelen
    private String merk;
    private int gewicht;


    //Constructors
    public Personenauto(){
        this("", 0, null);
    }

    public Personenauto(ProductInformatie productInformatie){
        this("", 0, productInformatie);
    }

    public Personenauto (String merk, int gewicht, ProductInformatie productInformatie) {
        this.merk = merk;
        this.gewicht = gewicht;
        this.productInformatie = productInformatie;
        if(productInformatie != null){
            setInformatieBeschrijving();
        }
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
    public void setInformatie1(String merk) {
        this.merk = merk;
        setBeschrijving();
    }

    public void setInformatie2(String gewicht) {
        this.gewicht = Integer.parseInt(gewicht);
        setBeschrijving();
    }

    private void setBeschrijving(){
        productInformatie.beschrijving = "Een personenauto van het merk " + this.merk +
                ". Het heeft een gewicht van " + this.gewicht + "kg.";
    }

    @Override
    public void setInformatieBeschrijving() {
        productInformatie.uniekeInfo1 = "Merk";
        productInformatie.uniekeInfo2 = "Gewicht";
        productInformatie.beschrijving = "Een personenauto van het merk " + merk + ". Het heeft een gewicht van " + gewicht + "kg.";
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
