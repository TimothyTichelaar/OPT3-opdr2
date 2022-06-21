package opdr2;

public abstract class Product {
    //-----Instance variabelen-----
    public ProductInformatie productInformatie;
    public VerhuurInformatie verhuurInformatie;

    public String uniekeInfo1;
    public String uniekeInfo2;
    public String beschrijving;

    //-----Constructor-----

    //-----Get methoden-----


    public ProductInformatie getProductInformatie() {
        return productInformatie;
    }

    public VerhuurInformatie getVerhuur(){return this.verhuurInformatie;};

    //-----Set methoden-----

    public void setProductInformatie(ProductInformatie productInformatie) {
        this.productInformatie = productInformatie;
    }

    public void setVerhuurInformatie(VerhuurInformatie verhuurInformatie) {
        this.verhuurInformatie = verhuurInformatie;
    }

    //-----Overige methoden-----
    abstract double prijsPerDag(boolean verzekering);
}
