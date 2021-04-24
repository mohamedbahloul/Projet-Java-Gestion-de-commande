
public class Test {

	public static void main(String[] args) {
		Gestion G=new Gestion();
		G.AddObj(new Client(111,"mohamed","ali"));
		System.out.println(G.AfficherClients());
		G.AddObj(new Commande(new Client(111,"mohamed","ali")));
		System.out.println(G.AfficherCommandes());
		System.out.println(G.AfficherClients());
		
		
		G.AddObj(new Produit("0021","Ma3joun asnen",400,87,60));
		System.out.println(G.AfficherProduits());
		G.AddObj(new Produit("0022","Ma3joun asnen",500,80,20));
		System.out.println(G.AfficherProduits());
		G.AddObj(new Produit("0021","Ma3jounnn asnen",500,80,20));
		System.out.println(G.AfficherProduits());
		G.setSoldeP("0021", 20);
		G.modifierQteProduit("0021", -100);
		Client c=G.RecherchClientParNom("mohamed", "ali");
		System.out.println(c.toString());
		
		
		
	}

}
