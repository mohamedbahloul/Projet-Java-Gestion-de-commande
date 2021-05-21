import java.util.ArrayList;

public interface gestionObjet {
	public ArrayList<Produit> ListP=new ArrayList<Produit>();
	public ArrayList<Commande> ListC=new ArrayList<Commande>();
	public ArrayList<Client> ListCl=new ArrayList<Client>();
	public boolean AddObj(Object obj);
	public boolean DeleteObj(Object obj) ;
	public boolean ModifierObj(Object obj) ;
}
