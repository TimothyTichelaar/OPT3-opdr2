package opdr2;

public class ProductInformatie {

    public String naam;
    public double huurprijsPerDag;
    public double verzekeringPerDag;

    public ProductInformatie (String naam, double huurprijsPerDag, double verzekeringPerDag) {
        this.naam = naam;
        this.huurprijsPerDag = huurprijsPerDag;
        this.verzekeringPerDag = verzekeringPerDag;
        //this.beschrijving = "Een personenauto van het merk " + merk + ". Het heeft een gewicht van " + gewicht + "kg.";
    }

    public String getNaam() {return this.naam;}

    public double getHuurprijsPerDag() {
        return this.huurprijsPerDag;
    }

    public double getVerzekeringPerDag() {
        return this.verzekeringPerDag;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setHuurprijsPerDag(double huurprijsPerDag) {
        this.huurprijsPerDag = huurprijsPerDag;
    }

    public void setVerzekeringPerDag(double verzekeringPerDag) {
        this.verzekeringPerDag = verzekeringPerDag;
    }
}
