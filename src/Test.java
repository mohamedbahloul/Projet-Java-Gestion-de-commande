
public class Test {

	public static void main(String[] args) {
		Gestion G=new Gestion();
		G.AddObj(new Client(111,"mohamed","ali"));
		System.out.println(G.AfficherClient());
		G.AddObj(new Commande(new Client(111,"mohamed","ali")));
		System.out.println(G.AfficherCommandes());
		System.out.println(G.AfficherClient());
		
		
		G.AddObj(new Produit("0021","Ma3joun asnen",400,87,60));
		System.out.println(G.AfficherProduit());
		G.AddObj(new Produit("0021","Ma3jounn asnen",500,80,20));
		System.out.println(G.AfficherProduit());
		G.AddObj(new Produit("0021","Ma3jounnn asnen",500,80,20));
		System.out.println(G.AfficherProduit());
		
		
	}

}
