package opdr2;

public class ProductInformatie {

    private String naam;
    private double huurprijsPerDag;
    private double verzekeringPerDag;

    private String uniekeInfo1;
    private String uniekeInfo2;
    private String beschrijving;

    public ProductInformatie (String naam, double huurprijsPerDag, double verzekeringPerDag) {
        this.naam = naam;
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
    }

    public String getNaam() {return this.naam;}

    public double getHuurprijsPerDag() {
        return this.huurprijsPerDag;
    }

    public double getVerzekeringPerDag() {
        return this.verzekeringPerDag;
    }

    public String getUniekeInfo1() {return uniekeInfo1;}

    public String getUniekeInfo2() {return uniekeInfo2;}

    public String getBeschrijving() {return beschrijving;}

    //-----Set methoden-----

    public void setHuurprijsPerDag(double huurprijsPerDag) {
        this.huurprijsPerDag = huurprijsPerDag;
    }

    public void setVerzekeringPerDag(double verzekeringPerDag) {
        this.verzekeringPerDag = verzekeringPerDag;
    }

    public void setUniekeInfo1(String uniekeInfo1) {this.uniekeInfo1 = uniekeInfo1;}

    public void setUniekeInfo2(String uniekeInfo2) {
        this.uniekeInfo2 = uniekeInfo2;
    }

    public void setBeschrijving(String beschrijving) {this.beschrijving = beschrijving;}
}
