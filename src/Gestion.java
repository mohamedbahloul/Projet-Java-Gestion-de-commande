
import java.util.ArrayList;


public class Gestion implements gestionObjet{

	public boolean AddObj(Object obj) {
		if(obj instanceof Commande) {
			boolean test=false;
			for(Client c : ListCl)
				if(((Commande)obj).getClient().getMatricule()== c.getMatricule() && ((Commande)obj).getClient().getNom()== c.getNom() && ((Commande)obj).getClient().getPrenom()== c.getPrenom()) {
					test=true;
					c.nbClient--;
					((Commande)obj).setClient(c);//changer le client par le client trouvé car lorsqu'on a fait new le system a creé un nouveau client
				}
			if(test==false) {
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
	
	public void AddProduitToCmd(Produit P,Commande C,int Qte) {
		
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
				System.out.println(p.toString());
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
	public Client RechercheClientParNom(String nom,String prenom) {
		for(Client c : ListCl) {
			if(( c.getNom().toLowerCase().equals(nom.toLowerCase())  || c.getNom().toLowerCase().equals(prenom.toLowerCase()) )&&( c.getPrenom().toLowerCase().equals(nom.toLowerCase()) || c.getPrenom().toLowerCase().equals(prenom.toLowerCase()))) {
				return c;
			}
		}
		return null;
	}
	public static Client RechercheClientParMatricule(int Mat) {
		for(Client c : ListCl) {
			if(c.getMatricule()==Mat) {
				return c;
			}
		}
		return null;
	}
	public ArrayList<Commande> RechercheCommandesParNomClient(String nom,String prenom){
		ArrayList<Commande> tmp=new ArrayList<Commande>();
		for(Commande c : ListC) {
			if(c.getClient().equals(RechercheClientParNom(nom,prenom)))
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
	public ArrayList<Commande> RechercheCommandesParDate(String d){
		ArrayList<Commande> tmp=new ArrayList<Commande>();
		for(Commande c : ListC) {
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
	
	public ArrayList<Produit> RechercheProduitParLibelle(String L){
		ArrayList<Produit> tmp=new ArrayList<Produit>();
		for(Produit p : ListP) {
			if(p.getLibelle().equals(L))
				tmp.add(p);
		}
		return tmp;
	}
	
	public ArrayList<Produit> RechercheProduitPartranchedePrix(float prixmin , float prixmax){
		ArrayList<Produit> tmp=new ArrayList<Produit>();
		for(Produit p : ListP) {
			if(p.getPrixfinal() >= prixmin && p.getPrixfinal() <= prixmax)
				tmp.add(p);
		}
		return tmp;
	}
	
        /////////PARTIE CALCUL ET AFFICHAGE DES COMMANDES DANS UNE PERIODE DONNEE/////////
	
	public ArrayList<Commande> RechercheCommandeParintervalleDate(String datemin , String datemax){
		ArrayList<Commande> tmp=new ArrayList<Commande>();
		for(Commande c : ListC) {
			String[] min = datemin.split("/");
			String[] max = datemax.split("/");
			String[] date= (c.getDateCmd()).split("/"); 
			if( Integer.valueOf(date[2])  >= Integer.valueOf(min[2]) && Integer.valueOf(max[2])  >= Integer.valueOf(date[2]) )
			{
				if( Integer.valueOf(date[1])  >= Integer.valueOf(min[1]) && Integer.valueOf(max[1])  >= Integer.valueOf(date[1]) )
					if ( Integer.valueOf(date[0])  >= Integer.valueOf(min[0]) && Integer.valueOf(max[0])  >= Integer.valueOf(date[0]) )
						{tmp.add(c);
						
						}
			}
				
		}
		return tmp;
		}
		
		
		public int countCommandeParintervalleDate(String datemin , String datemax){
			int count=0; 
			for(Commande c : ListC) {
				String[] min = datemin.split("/");
				String[] max = datemax.split("/");
				String[] date= (c.getDateCmd()).split("/"); 
				if( Integer.valueOf(date[2])  >= Integer.valueOf(min[2]) && Integer.valueOf(max[2])  >= Integer.valueOf(date[2]) )
				{
					if( Integer.valueOf(date[1])  >= Integer.valueOf(min[1]) && Integer.valueOf(max[1])  >= Integer.valueOf(date[1]) )
						if ( Integer.valueOf(date[0])  >= Integer.valueOf(min[0]) && Integer.valueOf(max[0])  >= Integer.valueOf(date[0]) )
							{
							count++;
							}
				}
					
			}
			return count;
		
	}
	
	
	
}
