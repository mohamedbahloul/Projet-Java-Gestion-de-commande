import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		Gestion G=new Gestion();
		G.AddObj(new Client(111,"mohamed","ali"));
		System.out.println(G.AfficherClients());
		G.AddObj(new Commande(new Client(111,"mohamed","ali")));
		G.AddObj(new Commande(new Client(111,"mohamed","ali")));
		G.AddObj(new Commande(new Client(112,"touhemi","ali")));
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
		System.out.println("Rechercheee Client");
		System.out.println(G.RechercheClientParNom("mohamed", "ali").toString());
		System.out.println(G.RechercheClientParMatricule(111).toString());
		System.out.println("Rechercheee Commande");
		
		System.out.println(G.RechercheCommandesParMatClient(112).toString());
		System.out.println(G.RechercheCommandesParNomClient("mohamed", "ali").toString());
		System.out.println(G.RechercheCommandesPariD(1).toString());
		System.out.println(G.RechercheCommandesParDate("24/04/2021").toString());
		
		
		System.out.println("Recherchee Produit");
		System.out.println(G.RechercheProduitParLibelle("Ma3joun asnen") .toString());
		System.out.println(G.RechercheProduitParRef("0022") .toString());
		System.out.println(G.RechercheProduitPartranchedePrix(0, 400) .toString());
		
		System.out.println("calcul et affichage des produits dans une periode donnée");
		System.out.println(G.RechercheCommandeParintervalleDate("1/01/2021", "30/10/2024") .toString());
		System.out.println("le nombre de commande dans cette periode est : " +G.countCommandeParintervalleDate("1/01/2021", "30/10/2024"));


		

	}

}
