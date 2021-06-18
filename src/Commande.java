import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Commande {
	private Client client; //la commande est relié à un client 
	private String dateCmd;
	public static int NbCommande;
	private int Id;
	private ArrayList<QteProd> ListP; // une liste qui contient tous le produits enregisté avec leurs qte
	DateFormat format = new SimpleDateFormat("dd/MM/yyyy"); //on prend la date toujours sous cette forme
	
	
	public void setClient(Client client) {
		this.client = client;
	}
	public void setDateCmd(String dateCmd) {
		this.dateCmd = dateCmd;
	}
	public static void setNbCommande(int nbCommande) {
		NbCommande = nbCommande;
	}
	
	
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
	
	//constructeur qui prend en paramètre seulement le client (lorsque on ne  donne pas la date)
	
	public Commande(Client client) {

		Id=NbCommande++; // l' ID du commande esr incrémenté automatiquement
		dateCmd=format.format(new Date()); ///si la date n'est pas donnée on prend la date du système
		this.client=client;
		ListP=new ArrayList<QteProd>();
	}
	
	//constructeur qui prend en paramètre le client est la date ( lorsque la date est donnée) 
	public Commande (Client client,String dateCmd) {
		Id=NbCommande++;
		this.dateCmd=dateCmd;
		this.client=client;
		ListP=new ArrayList<QteProd>();
	}
	
	//getprixTotal permet de calculer le prix total de la commande (on calculant le prix du produit*qte)
	public double getprixTotal() {
		double prix=0;
		for(int i =0;i<ListP.size();i++) {
			prix+=ListP.get(i).getQte()*ListP.get(i).getProduit().getPrixfinal();
		}
		return Math.round(prix);
	}
	
	/*Addproduit permet d'ajouter le produit à la commande ,
	lorsque le produit est ajouté à la commande il va etre soustraire de la qte du produit stocké */
	
	public boolean AddProduit(Produit p,int Qte) {
		if(p.getQte()>=Qte) {
			for(QteProd qp:ListP) {
				if(qp.getProduit().equals(p)) {
					p.modifyQte(-Qte);
					qp.setQte(qp.getQte()+Qte);
					
				}
			}
			ListP.add(new QteProd(p,Qte));
			p.modifyQte(-Qte);
			return true;
		}
		else {
			return false;
		}
	}
	
	public void AddProduitFromRead(Produit p,int Qte) {
			ListP.add(new QteProd(p,Qte));
	}
	
	///Save pour enregistrer la commande dans le fichier
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
