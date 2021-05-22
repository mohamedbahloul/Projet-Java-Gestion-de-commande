import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Commande {
	public void setClient(Client client) {
		this.client = client;
	}
	public void setDateCmd(String dateCmd) {
		this.dateCmd = dateCmd;
	}
	public static void setNbCommande(int nbCommande) {
		NbCommande = nbCommande;
	}
	private Client client;
	private String dateCmd;
	public static int NbCommande;
	private int Id;
	private ArrayList<QteProd> ListP;
	DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	public int getId() {
		return Id;
	}
	public void setId(int i) {Id=i;}
	public Client getClient() {
		return client;
	}
	public String getDateCmd() {
		return dateCmd;
	}
	public ArrayList<QteProd> getListP() {
		return ListP;
	}
	
	public Commande(Client client) {

		Id=NbCommande++;
		dateCmd=format.format(new Date());
		this.client=client;
		ListP=new ArrayList<QteProd>();
	}
	public Commande (Client client,String dateCmd) {
		Id=NbCommande++;
		this.dateCmd=dateCmd;
		this.client=client;
		ListP=new ArrayList<QteProd>();
	}
	public double getprixTotal() {
		double prix=0;
		for(int i =0;i<ListP.size();i++) {
			prix+=ListP.get(i).getQte()*ListP.get(i).getProduit().getPrixfinal();
		}
		return prix;
	}
	public void AddProduit(Produit p,int Qte) {
		if(p.getQte()>=Qte) {
			for(QteProd qp:ListP) {
				if(qp.getProduit().equals(p)) {
					p.modifyQte(-Qte);
					qp.setQte(qp.getQte()+Qte);
					return;
				}
			}
			ListP.add(new QteProd(p,Qte));
			p.modifyQte(-Qte);
		}
		else {
			System.out.println("stock insuffisant");
		}
	}
	public void AddProduitFromRead(Produit p,int Qte) {
			ListP.add(new QteProd(p,Qte));
	}
	public void AddProduitRef(String ref,int Qte) {
		
	}
	public String Save() {
		 String S=Id +"\t"+ client.getMatricule()+"\t"+dateCmd+"\t";
		for(int i =0;i<ListP.size();i++) {
			S+=ListP.get(i).getProduit().getRef()+"\t";
			S+=ListP.get(i).getQte()+"\t";
		}
		return S;
	}
	public String toString() {
		 String s="id = "+ Id +"\t"+ client.toString()+"\t date = "+dateCmd;
		 int i=0;
		 for(QteProd qp:ListP) {
			 s+="\tRef Produit "+i +" = "+qp.getProduit().getRef()+"\tQte = "+qp.getQte();
			 i++;
		 }
		 return s;
	}
	
}
