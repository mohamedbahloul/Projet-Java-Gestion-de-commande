import java.util.ArrayList;

public interface gestionObjet {
	public ArrayList<Produit> ListP=new ArrayList<Produit>();
	public ArrayList<Commande> ListC=new ArrayList<Commande>();
	public ArrayList<Client> ListCl=new ArrayList<Client>();
	public void AddObj(Object obj);
	public void DeleteObj(Object obj) ;
}
