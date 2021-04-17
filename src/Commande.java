import java.util.Date;
import java.util.ArrayList;
public class Commande {
	private Client client;
	private Date dateCmd;
	private ArrayList<Produit> ListP;
	public Commande(Client client) {
		dateCmd=new Date();
		this.client=client;
		ListP=new ArrayList<Produit>();
	}
	public Commande (Client client,Date dateCmd) {
		this.dateCmd=dateCmd;
		this.client=client;
		ListP=new ArrayList<Produit>();
	}
	public void AddProduit(Produit p,int Qte) {
		ListP.add(p);
	}
	public void AddProduitRef(String ref,int Qte) {
		
	}
	
}
