package opdr2;

public abstract class Product {
    //-----Instance variabelen-----
    public String naam;
    public String beschrijving;
    public double huurprijsPerDag;
    public double verzekeringPerDag;
    public boolean verhuurd;
    public VerhuurInformatie verhuurInformatie;

    //-----Constructor-----

    //-----Get methoden-----
    public String getNaam() {return this.naam;}

    public String getBeschrijving(){return this.beschrijving;}

    public double getHuurprijsPerDag() {
        return this.huurprijsPerDag;
    }

    public double getVerzekeringPerDag() {
        return this.verzekeringPerDag;
    }

    public boolean getVerhuurd() {return this.verhuurd;}

    public VerhuurInformatie getVerhuur(){return this.verhuurInformatie;};

    //-----Set methoden


    public void setNaam(String naam) {
        this.naam = naam;
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

    public void setVerhuurInformatie(VerhuurInformatie verhuurInformatie){this.verhuurInformatie = verhuurInformatie;}

    //-----Overige methoden-----
    abstract double prijsPerDag(boolean verzekering);
}
