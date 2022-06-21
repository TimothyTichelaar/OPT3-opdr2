package opdr2;

public class Vrachtauto extends Product{
    //Instance variabelen
    private int laadvermogen;
    private int gewicht;


    //Constructor
    public Vrachtauto(){
        this(0, 0, null);
    }

    public Vrachtauto (int laadvermogen, int gewicht, ProductInformatie productInformatie) {
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
        this.beschrijving = "Een vrachtauto met " + laadvermogen + "kg laadvermogen. Het heeft een gewicht van " + gewicht + "kg.";
        this.productInformatie = productInformatie;
        this.verhuurInformatie = null;
    }

    //Get methoden
    public int getLaadvermogen () {
        return this.laadvermogen;
    }

    public int getGewicht () {
        return this.gewicht;
    }

    public String getBeschrijving(){return this.beschrijving;}

    //Set methoden
    public void setInformatie1(String laadvermogen) {
        this.laadvermogen = Integer.parseInt(laadvermogen);
        setBeschrijving();
    }

    public void setInformatie2(String gewicht) {
        this.gewicht = Integer.parseInt(gewicht);
        setBeschrijving();
    }

    public void setLaadvermogen(int laadvermogen) {
        this.laadvermogen = laadvermogen;
        setBeschrijving();
    }

    public void setGewicht(int gewicht) {
        this.gewicht = gewicht;
        setBeschrijving();
    }

    private void setBeschrijving(){
        this.beschrijving = "Een vrachtauto met " + this.laadvermogen + "kg laadvermogen. Het heeft een gewicht van " + this.gewicht + "kg.";
    }


    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        return 0;
    }
}
