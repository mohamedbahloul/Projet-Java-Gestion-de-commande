public class Produit {
	private String ref,libelle;
	private float PHT,Taxe;
	private int Qte;
	private float solde;
	
	//PHT est le prix hors taxe 
	
	public float getPHT() {
		return PHT;
	}
	public void setPHT(float pHT) {
		PHT = pHT;
	}
	public float getTaxe() {
		return Taxe;
	}
	public void setTaxe(float taxe) {
		Taxe = taxe;
	}
	public void setQte(int Qte) {
		this.Qte = Qte;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getQte() {
		return Qte;
	}
	
	///le pourcentage de solde doit etre compris entre 0 et 100% 
	public boolean setSolde(float solde) {
		if(solde>100||solde<0)
			return false;
		this.solde=solde;
		return true;
	}
	public String getRef() {
		return ref;
	}
	public String getLibelle() {
		return libelle;
	}
	
	/* la methode soustraire la quantité permet de modifier la quantité si cette quantité est suffisante 
	sinon on ne peut pas , pour l'ajout toujours en peut ajouter la qte de produit */
	
	public void modifyQte(int n) {
		if(Qte>= Math.abs(n)) {
			Qte += n;
			System.out.println("La quantité du produit ayant la ref "+ref+" a été modifié!  La nouvelle quantité est  "+Qte);
		}	
		else {
			System.out.println("Cette Quantité est indisponible dans le stock");
		}
	}
	
	
	public float getTauxReduction() {
			return solde;
	}
	/*la methode getPrixfinal permet de calculer le prix final 
	de produit (en utilisant le taxe , le prix hors taxe et le solde)*/
	
	public float getPrixfinal() {
		return (PHT+Taxe)-(PHT+Taxe)*(solde/100);
	}
	
	///le constructeur Produit , on prend la solde par defaut =0 
	public Produit(String ref,String libelle,float PHT,float Taxe,int Qte) {
		this.ref=ref;
		this.libelle=libelle;
		this.PHT=PHT;
		this.Taxe=Taxe;
		this.Qte=Qte;	
		solde=0;
	}
	
	// la methode Save pour enregistrer les infos de produit dans le fichier
	
	public String Save() {
		return ref+"\t"+libelle+"\t"+PHT+"\t"+Taxe+"\t"+Qte+"\t"+solde;
	}
	
	public String toString() {
		 String S="Ref = "+ref+"\t Libelle = "+libelle+"\t prix Produit = "+getPrixfinal()+"\t Quantité en stock = "+Qte;
		 if(solde!=0) //si la solde est different à 0 , on affiche son %
			 S+="\t Solde= "+solde+"%";
		 return S;
	}
	
}
