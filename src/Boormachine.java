public class Boormachine extends Product{
    //Instance variabelen
    private String merk;
    private String type;


    //Constructor
    public Boormachine (){
        this.huurprijsPerDag = 0;
        this.verzekeringPerDag = 0;
        this.verhuurd = false;
        this.merk = "";
        this.type = "";
    }

    public Boormachine (String merk, String type, double huurprijsPerDag, double verzekeringPerDag, boolean verhuurd) {
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
        this.verhuurd = verhuurd;
        this.merk = merk;
        this.type = type;
    }

    //Get methoden
    public String getMerk () {
        return this.merk;
    }

    public String getType () {
        return this.type;
    }

    public double getHuurprijsPerDag() {
        return this.huurprijsPerDag;
    }

    public double getVerzekeringPerDag() {
        return this.verzekeringPerDag;
    }

    public boolean getVerhuurd() { return this.verhuurd; }

    //Set methoden

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setHuurprijsPerDag(double huurprijsPerDag) {
        this.huurprijsPerDag = huurprijsPerDag;
    }

    public void setVerzekeringPerDag(double verzekeringPerDag) {
        this.verzekeringPerDag = verzekeringPerDag;
    }

    public void setVerhuurd(boolean verhuren) {
        this.verhuurd = verhuren;
    }

    //Interface methoden
    @Override
    public double prijsPerDag (boolean verzekering, int leeftijd) {
        return 0;
    }
}
