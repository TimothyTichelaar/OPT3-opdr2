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
        super(productInformatie, null);
        this.laadvermogen = laadvermogen;
        this.gewicht = gewicht;
        if(productInformatie != null){
            setInformatieBeschrijving();
        }
    }

    //Get methoden

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
        productInformatie.setBeschrijving("Een vrachtauto met " + this.laadvermogen +
                "kg laadvermogen. Het heeft een gewicht van " + this.gewicht + "kg.");
    }

    @Override
    public void setInformatieBeschrijving() {
        this.productInformatie.setUniekeInfo1("Laadverogen");
        this.productInformatie.setUniekeInfo2("Gewicht");
        this.productInformatie.setBeschrijving("Een vrachtauto met " + laadvermogen +
                "kg laadvermogen. Het heeft een gewicht van " + gewicht + "kg.");
    }

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        return 0;
    }
}
