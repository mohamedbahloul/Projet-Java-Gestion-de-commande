import java.util.Date;
import java.util.ArrayList;
public class Commande {
	public void setClient(Client client) {
		this.client = client;
	}
	private Client client;
	private Date dateCmd;
	public Client getClient() {
		return client;
	}
	public Date getDateCmd() {
		return dateCmd;
	}
	public ArrayList<Produit> getListP() {
		return ListP;
	}
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
	public double getprixTotal() {
		double prix=0;
		for(int i =0;i<ListP.size();i++) {
			prix+=ListP.get(i).getQte()*ListP.get(i).getPrixfinal();
		}
		return prix;
	}
	public void AddProduit(Produit p,int Qte) {
		if(p.getQte()>=Qte) {
			ListP.add(p);
			p.modifyQte(-Qte);
		}
		else {
			System.out.println("stock insuffisant");
		}
	}
	public void AddProduitRef(String ref,int Qte) {
		
	}
	public String toString() {
		return client.toString()+"\t date = "+dateCmd;
	}
	
}
