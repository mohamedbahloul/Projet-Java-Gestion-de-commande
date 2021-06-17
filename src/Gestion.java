
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class Gestion implements gestionObjet{

	public boolean AddObj(Object obj) {
		if(obj instanceof Commande) {
			Client cl=RechercheClientParMatricule((((Commande) obj).getClient()).getMatricule());
				if(cl!=null) {
					cl.nbClient--;
					((Commande)obj).setClient(cl);//changer le client par le client trouvé car lorsqu'on a fait new le system a creé un nouveau client
				}
				else {
					ListCl.add(((Commande)obj).getClient());
				}
			ListC.add((Commande)obj);
			return true;
		}
		else if(obj instanceof Client) {
			Client c=RechercheClientParMatricule(((Client) obj).getMatricule());
			
			if(c==null) {
					ListCl.add((Client)obj);
					return true;
			}
			return false;
		}
		else if(obj instanceof Produit) {
			Produit p=RechercheProduitParRef(((Produit) obj).getRef());
				if(p!=null){ 
					System.out.println("Cet référence existe déja!!");
					return false;
				}
			ListP.add((Produit)obj);
				return true;
				
		}
		return false;
	}
	/*le client yetbadel l matricule mte3ou fel commande walla ki na3mel modifier walla nkhaliwahh clé primaire
	si oui lazem ki na3mel modifier l client w manel9ahech fel tableau yetzed  */
	public boolean ModifierObj(Object obj) {					
		if(obj instanceof Commande) {
			Commande c=RechercheCommandesPariD(((Commande) obj).getId());
			if(c==null)
				return false;
			else {
				c.setClient(((Commande) obj).getClient());
				c.setDateCmd(((Commande) obj).getDateCmd());
				c.getListP().clear();
				for(QteProd p:((Commande) obj).getListP())
					c.AddProduit(p.getProduit(), p.getQte());
			}
		}
		else if(obj instanceof Client) {
			Client c=RechercheClientParMatricule(((Client) obj).getMatricule());
			if(c==null)
				return false;
			else {
				c.setNom(((Client) obj).getNom());
				c.setPrenom(c.getPrenom());
			}
		}
		else if(obj instanceof Produit) {
			Produit p=RechercheProduitParRef(((Produit) obj).getRef());
			if(p==null)
				return false;
			else {
				p.setPHT(((Produit) obj).getPHT());
				p.setQte(((Produit) obj).getQte());
				p.setSolde(((Produit) obj).getTauxReduction());
				p.setTaxe(((Produit) obj).getTaxe());
			}
		}
		return true;
	}
	public boolean DeleteObj(Object obj) {
		if(obj instanceof Commande) {
			Commande c=RechercheCommandesPariD(((Commande) obj).getId());
			if(c==null)
				return false;
			ListC.remove(obj);
		}
		else if(obj instanceof Client) {
			Client c=RechercheClientParMatricule(((Client) obj).getMatricule());
			if(c==null)
				return false;
			ListCl.remove(obj);
		}
		else if(obj instanceof Produit) {
			Produit p=RechercheProduitParRef(((Produit) obj).getRef());
			if(p==null)
				return false;
			ListP.remove(obj);
		}
		return true;
	}
	public ArrayList<Produit> getListP(){return ListP;}
	public ArrayList<Client> getListCl(){return ListCl;}
	public ArrayList<Commande> getListC(){return ListC;}
	public String AfficherCommandes () {
		return ListC.toString()+"\n";
	}
	public String AfficherClients () {
		return ListCl.toString()+"\n";
	}
	public String AfficherProduits () {
		return ListP.toString()+"\n";
	}
	public void setSoldeP(String ref,float solde) {
		for(Produit p : ListP) {
			if(p.getRef()==ref) {
				p.setSolde(solde);
				System.out.println("Le produit ayant la reférence "+ref +" est soldé avec un taux de réduction égale à "+p.getTauxReduction() +" Le prix finale de ce produit est "+p.getPrixfinal());
				return;
			}
		System.out.println("Ce produit n'existe pas!!");
		}
		
	}
	public void unsetSolde(String ref) {
		for(Produit p : ListP) {
			if(p.getRef()==ref) {
				p.setSolde(0);
				System.out.println("Le produit ayant la reférence "+ref +" n'est pas soldé");
				return;
			}
		System.out.println("Ce produit n'existe pas!!");
		}
	}
	public void modifierQteProduit(String ref,int Qte) {
		for(Produit p : ListP)
		{
			if(p.getRef()==ref) {
				p.modifyQte(Qte);
				return;
			}
		}
		System.out.println("Ce produit n'existe pas!!");
		
		
	}
	/////////PARTIE RECHERCHE/////////
	public ArrayList<Client> RechercheClientParNom(String nom,String prenom,ArrayList<Client> listclient) {
		ArrayList<Client> cl=new ArrayList<Client>();
		if(listclient!=null)
			for(Client c : listclient) {
				if(!prenom.equals("")&&!nom.equals("")) {
					if(( c.getNom().toLowerCase().equals(nom.toLowerCase())  )&&(c.getPrenom().toLowerCase().equals(prenom.toLowerCase()))) {
						cl.add(c);	
					}
				}
				else if(nom.equals("")) {
					if(c.getPrenom().toLowerCase().equals(prenom.toLowerCase())){
						cl.add(c);			
						}
				}
				else {
					if( c.getNom().toLowerCase().equals(nom.toLowerCase())) {
						cl.add(c);
					}
				}
				
					
			}
		return cl;
		
	}
	public Client RechercheClientParMatricule(int Mat) {
		for(Client c : ListCl) {
			if( c.getMatricule()== Mat) {
				return c;
			}
		}
		return null;
	}
	public Client RechercheClientParId(int id) {
		for(Client c : ListCl) {
			if( c.getIdC()== id) {
				return c;
			}
		}
		return null;
	}
	public ArrayList<Commande> RechercheCommandesParNomClient(String nom,String prenom){
		ArrayList<Commande> tmp=new ArrayList<Commande>();
		for(Commande c : ListC) {
			if(RechercheClientParNom(nom,prenom,ListCl).contains(c.getClient()))
				tmp.add(c);
		}
		return tmp;
	}
	public ArrayList<Commande> RechercheCommandesParMatClient(int Matricule){
		ArrayList<Commande> tmp=new ArrayList<Commande>();
		for(Commande c : ListC) {
			if(c.getClient().equals(RechercheClientParMatricule(Matricule)))
				tmp.add(c);
		}
		return tmp;
	}
	public Commande RechercheCommandesPariD(int id){
		
		for(Commande c : ListC) {
			if(c.getId()==id)
				return c;
		}
		return null;
	}
	public ArrayList<Commande> RechercheCommandesParDate(String d,ArrayList<Commande> ListeCmd){
		ArrayList<Commande> tmp=new ArrayList<Commande>();
		for(Commande c : ListeCmd) {
			if(c.getDateCmd().equals(d))
				tmp.add(c);
		}
		return tmp;
	}
	public Produit RechercheProduitParRef(String R){
		for(Produit p : ListP) {
			if(p.getRef().equals(R))
				return p;
		}
		return null;
	}
	
	public ArrayList<Produit> RechercheProduitParLibelle(String L,ArrayList<Produit> ListeP){
		ArrayList<Produit> tmp=new ArrayList<Produit>();
		for(Produit p : ListeP) {
			if(p.getLibelle().equals(L))
				tmp.add(p);
		}
		return tmp;
	}
	
	public ArrayList<Produit> RechercheProduitPartranchedePrix(float prixmin , float prixmax,ArrayList<Produit> ListeP){
		ArrayList<Produit> tmp=new ArrayList<Produit>();
		for(Produit p : ListP) {
			if(p.getPrixfinal() >= prixmin && p.getPrixfinal() <= prixmax)
				tmp.add(p);
		}
		return tmp;
	}
	
        /////////PARTIE CALCUL ET AFFICHAGE DES COMMANDES DANS UNE PERIODE DONNEE/////////
	
	
		
	public ArrayList<Commande> RechercheCommandeParintervalleDate2(String datemin , String datemax) throws ParseException{
		SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy");
	    Date act ;
	    ArrayList<Commande> tmp=new ArrayList<Commande>();
		for(Commande c : ListC) {
			act = sdformat.parse(c.getDateCmd());
			if(!datemin.equals("")&&!datemax.equals("")) {
				Date max =sdformat.parse(datemax); 
			    Date min =sdformat.parse(datemin);
				if(max.compareTo(act)>=0&&act.compareTo(min)>=0) {
					tmp.add(c);	
				}
			}
			else if (datemin.equals("")) {
				Date max =sdformat.parse(datemax); 
				if(max.compareTo(act)>=0) {
					tmp.add(c);	
				}
			}
			else {
				Date min =sdformat.parse(datemin);
				if(act.compareTo(min)>=0) {
					tmp.add(c);	
				}
			}
		}
	    return tmp;
	}
	
	
}
