import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Commande {
	public void setClient(Client client) {
		this.client = client;
	}
	private Client client;
	private String dateCmd;
	public static int NbCommande;
	private int Id;
	DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	public int getId() {
		return Id;
	}
	public Client getClient() {
		return client;
	}
	public String getDateCmd() {
		return dateCmd;
	}
	public ArrayList<Produit> getListP() {
		return ListP;
	}
	private ArrayList<Produit> ListP;
	public Commande(Client client) {

		Id=NbCommande++;
		dateCmd=format.format(new Date());
		this.client=client;
		ListP=new ArrayList<Produit>();
	}
	public Commande (Client client,String dateCmd) {
		Id=NbCommande++;
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
	public String Save() {
		return Id +"\t"+ client.toString()+"\t"+dateCmd;
	}
	public String toString() {
		return "id = "+ Id +"\t"+ client.toString()+"\t date = "+dateCmd;
	}
	
}
