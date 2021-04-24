import java.util.ArrayList;

public class Gestion implements gestionObjet{
	public void AddObj(Object obj) {
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
		}
		else if(obj instanceof Client) {
			ListCl.add((Client)obj);
		}
		else if(obj instanceof Produit) {
			boolean test=false;
			for(Produit p : ListP)
				if(((Produit)obj).getRef()== p.getRef() && ((Produit)obj).getLibelle()== p.getLibelle()){ // le prix du produit peut differt lorsque il y q un nouveau stock 
					test=true;
					if(((Produit)obj).getPrixfinal()== p.getPrixfinal()) {
						p.modifyQte(((Produit)obj).getQte());
					} else {
						System.out.println("2 Produits ayant la méme ref et un prix différent ! SVP Changer l'une des eux ");
					}
				}
			if(test==false)
				ListP.add((Produit)obj);
		}
	}
	public void DeleteObj(Object obj) {
		if(obj instanceof Commande) {
			ListC.remove((Commande)obj);
		}
		else if(obj instanceof Client) {
			ListCl.remove((Client)obj);
		}
		else if(obj instanceof Produit) {
			ListP.remove((Produit)obj);
		}
	}
	public ArrayList<Produit> getListP(){return ListP;}
	public ArrayList<Client> getListCl(){return ListCl;}
	public ArrayList<Commande> getListC(){return ListC;}
	public String AfficherCommandes () {
		String s="";
		for(int i=0;i<ListC.size();i++) {
			s+=ListC.toString()+"\n";
		}
		return s;
	}
	public String AfficherClient () {
		String s="";
		for(int i=0;i<ListCl.size();i++) {
			s+=ListCl.toString()+"\n";
		}
		return s;
	}
	public String AfficherProduit () {
		String s="";
		for(int i=0;i<ListP.size();i++) {
			s+=ListP.toString()+"\n";
		}
		return s;
	}

}
