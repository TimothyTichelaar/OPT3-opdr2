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
    public String getMerk () {
        return this.merk;
    }

    public String getType () {
        return this.type;
    }

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
        productInformatie.beschrijving = "Een boormachine van het merk " + this.merk + ". Het is de  " + this.type + " uitvoering.";
    }

    public void setInformatieBeschrijving(){
        productInformatie.uniekeInfo1 = "Merk";
        productInformatie.uniekeInfo2 = "Type";
        productInformatie.beschrijving = "Een boormachine van het merk " + merk + ". Het is de  " + type + " uitvoering.";
    }

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering) {
        return 0;
    }
}
