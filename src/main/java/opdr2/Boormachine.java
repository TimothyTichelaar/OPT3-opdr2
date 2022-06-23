package opdr2;

public class Boormachine extends Product{
    //Instance variabelen
    private String merk;
    private String type;


    //Constructor
    public Boormachine (){
        this("", "", null);
    }

    public Boormachine(ProductInformatie productInformatie){
        this("", "", productInformatie);
    }

    public Boormachine (String merk, String type, ProductInformatie productInformatie) {
        super(productInformatie, null);
        this.merk = merk;
        this.type = type;
        if(productInformatie != null){
            setInformatieBeschrijving();
        }
    }

    //Get methoden

    //Set methoden
    public void setInformatie1(String merk) {
        this.merk = merk;
        setBeschrijving();
    }

    public void setInformatie2(String type) {
        this.type = type;
        setBeschrijving();
    }

    private void setBeschrijving(){
        productInformatie.setBeschrijving("Een boormachine van het merk " + this.merk + ". Het is de  " + this.type + " uitvoering.");
    }

    public void setInformatieBeschrijving(){
        productInformatie.setUniekeInfo1("Merk");
        productInformatie.setUniekeInfo2("Type");
        this.setBeschrijving();
    }

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        double huurprijs = this.productInformatie.getHuurprijsPerDag();
        if(verzekering){
            huurprijs += this.productInformatie.getVerzekeringPerDag();
        }
        return huurprijs;
    }
}
