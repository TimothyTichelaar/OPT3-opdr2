package opdr2;

public class Boormachine extends Product{
    //Instance variabelen
    private String merk;
    private String type;


    //Constructor
    public Boormachine (){
        this("", "", null);
    }

    public Boormachine (String merk, String type, ProductInformatie productInfo) {
        this.merk = merk;
        this.type = type;
        this.uniekeInfo1 = "merk";
        this.uniekeInfo2 = "type";
        this.beschrijving = "Een boormachine van het merk " + merk + ". Het is de  " + type + " uitvoering.";
        this.productInformatie = productInfo;
        this.verhuurInformatie = null;
    }

    //Get methoden
    public String getMerk () {
        return this.merk;
    }

    public String getType () {
        return this.type;
    }

    public String getBeschrijving(){return this.beschrijving;}

    //Set methoden
    public void setInformatie1(String merk) {
        this.merk = merk;
        setBeschrijving();
    }

    public void setInformatie2(String type) {
        this.type = type;
        setBeschrijving();
    }

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
