public abstract class ProduitFactory {
    public Produit geProduit(){
        return createProduit();
    }
    protected abstract Produit createProduit();

}
