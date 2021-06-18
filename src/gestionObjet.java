import java.util.ArrayList;
/* il ya des methodes qui se répetent plusieurs fois comme ADD, Delete et modifier
pour cela on a crée une interface*/
public interface gestionObjet {
	public ArrayList<Produit> ListP=new ArrayList<Produit>(); //liste de produits
	public ArrayList<Commande> ListC=new ArrayList<Commande>();//liste de commandes
	public ArrayList<Client> ListCl=new ArrayList<Client>();//liste de clients
	public boolean AddObj(Object obj);
	public boolean DeleteObj(Object obj) ;
	public boolean ModifierObj(Object obj) ;
}
