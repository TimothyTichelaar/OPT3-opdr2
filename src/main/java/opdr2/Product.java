package opdr2;

public abstract class Product {
    //-----Instance variabelen-----
    public ProductInformatie productInformatie;
    public VerhuurInformatie verhuurInformatie;

    //-----Constructor-----

    //-----Get methoden-----


    public ProductInformatie getProductInformatie() {
        return this.productInformatie;
    }

    public VerhuurInformatie getVerhuurInformatie(){return this.verhuurInformatie;}

    public boolean getVerhuurd() {
        return verhuurInformatie != null;
    }

    public String getBeschrijving(){return productInformatie.beschrijving;}

    public String getNaam(){return productInformatie.getNaam();}

    //-----Set methoden-----

    public void setProductInformatie(ProductInformatie productInformatie) {
        this.productInformatie = productInformatie;
        setInformatieBeschrijving();
    }

    public void setVerhuurInformatie(VerhuurInformatie verhuurInformatie) {
        this.verhuurInformatie = verhuurInformatie;
    }

    public abstract void setInformatie1(String info1);

    public abstract void setInformatie2(String info2);

    public abstract void setInformatieBeschrijving();

    //-----Overige methoden-----
    abstract double prijsPerDag(boolean verzekering);
}
