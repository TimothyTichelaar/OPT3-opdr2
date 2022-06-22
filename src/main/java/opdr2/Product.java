package opdr2;

public abstract class Product {
    //-----Instance variabelen-----
    public ProductInformatie productInformatie;
    public VerhuurInformatie verhuurInformatie;

    public String uniekeInfo1;
    public String uniekeInfo2;
    public String beschrijving;
    public boolean verhuurd;

    //-----Constructor-----

    //-----Get methoden-----


    public ProductInformatie getProductInformatie() {
        return productInformatie;
    }

    public VerhuurInformatie getVerhuur(){return this.verhuurInformatie;};

    public boolean getVerhuurd() {
        return verhuurd;
    }

    public String getBeschrijving(){return this.beschrijving;}

    public String getNaam(){return productInformatie.getNaam();}

    //-----Set methoden-----

    public void setProductInformatie(ProductInformatie productInformatie) {
        this.productInformatie = productInformatie;
    }

    public void setVerhuurInformatie(VerhuurInformatie verhuurInformatie) {
        this.verhuurInformatie = verhuurInformatie;
        setVerhuurd(verhuurInformatie != null);
    }

    public void setVerhuurd(boolean verhuurd) {
        this.verhuurd = verhuurd;
    }

    public abstract void setInformatie1(String info1);

    public abstract void setInformatie2(String info2);

    //-----Overige methoden-----
    abstract double prijsPerDag(boolean verzekering);
}
