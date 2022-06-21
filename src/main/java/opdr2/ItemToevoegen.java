package opdr2;

public abstract class ItemToevoegen {
    public Product product;

    public ItemToevoegen (Product product) {
        this.product = product;
    }

    public ItemToevoegen() {

    }

    public abstract void getProductInformatie (Product product);

    public abstract Product addProduct ();
}
