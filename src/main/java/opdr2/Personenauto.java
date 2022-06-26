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
        super(productInformatie, null);
        this.merk = merk;
        this.gewicht = gewicht;
        if(productInformatie != null){
            setInformatieBeschrijving();
        }
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
        productInformatie.setBeschrijving("Een personenauto van het merk " + this.merk +
                ". Het heeft een gewicht van " + this.gewicht + "kg.");
    }

    @Override
    public void setInformatieBeschrijving() {
        productInformatie.setUniekeInfo1("Merk");
        productInformatie.setUniekeInfo2("Gewicht");
        setBeschrijving();
    }

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        double huurprijs = productInformatie.getHuurprijsPerDag();
        if(verzekering){
            huurprijs += (productInformatie.getVerzekeringPerDag() * this.gewicht);
        }
        return huurprijs;
    }
}
