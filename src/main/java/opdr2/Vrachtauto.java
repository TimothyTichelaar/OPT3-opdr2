package opdr2;

public class Vrachtauto extends Product{
    //Instance variabelen
    private int laadvermogen;
    private int gewicht;


    //Constructor
    public Vrachtauto(){
        this(0, 0, null);
    }

    public Vrachtauto(ProductInformatie productInformatie){
        this(0, 0, productInformatie);
    }

    public Vrachtauto (int laadvermogen, int gewicht, ProductInformatie productInformatie) {
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
        this.productInformatie = productInformatie;
        if(productInformatie != null){
            setInformatieBeschrijving();
        }
        this.verhuurInformatie = null;
    }

    //Get methoden
    public int getLaadvermogen () {
        return this.laadvermogen;
    }

    public int getGewicht () {
        return this.gewicht;
    }

    //Set methoden
    public void setInformatie1(String laadvermogen) {
        this.laadvermogen = Integer.parseInt(laadvermogen);
        setBeschrijving();
    }

    public void setInformatie2(String gewicht) {
        this.gewicht = Integer.parseInt(gewicht);
        setBeschrijving();
    }

    private void setBeschrijving(){
        productInformatie.beschrijving = "Een vrachtauto met " + this.laadvermogen +
                "kg laadvermogen. Het heeft een gewicht van " + this.gewicht + "kg.";
    }

    @Override
    public void setInformatieBeschrijving() {
        productInformatie.uniekeInfo1 = "Laadverogen";
        productInformatie.uniekeInfo2 = "Gewicht";
        productInformatie.beschrijving = "Een vrachtauto met " + laadvermogen +
                "kg laadvermogen. Het heeft een gewicht van " + gewicht + "kg.";
    }

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        return 0;
    }
}
