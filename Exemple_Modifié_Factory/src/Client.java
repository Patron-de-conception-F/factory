public class Client {
    public static void main(String[] args)   {
        System.out.println("Hello, World!");
        ProduitFactory produitfactoryA= new ProduitFactoryA();
        ProduitFactory produitfactoryB= new ProduitFactoryB();
        ProduitFactory produitfactoryC= new ProduitFactoryC();
         ProduitFactory produitfactoryD= new ProduitFactoryD();
        Produit produit= null;
        // affiche un produit de type A
        produit=produitfactoryA.geProduit();
        produit.methodeproduit();
        // affiche un produit de type B
        produit=produitfactoryB.geProduit();
        produit.methodeproduit();
        // C
        produit=produitfactoryC.geProduit();
        produit.methodeproduit();
        // D
        produit=produitfactoryD.geProduit();
        produit.methodeproduit();





    
        


    }
}
