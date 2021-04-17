
public class Produit {
	private String ref,libelle;
	private float PHT,Taxe;
	private int Qte;
	private float solde;	
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
		this.Qte += Qte;
	}
	public int getQte() {
		return Qte;
	}
	public void setSolde(float solde) {
		this.solde=solde;
	}
	public int modifyQte(int n) {
		if(n+Qte<0)
			return 1;
		else {
			Qte += n;
			return 0;
		}
	}
	public float getTauxReduction() {
		if(solde!=0)
			return (PHT+Taxe)*(solde/100);
		else
			return 0;
	}
	private float getPrixfinal() {
		if(solde!=0) {
			return (PHT+Taxe)+(PHT+Taxe)*(solde/100);
		}
		else 
			return PHT+Taxe;
	}
	public Produit(String ref,String libelle,float PHT,float Taxe,int Qte) {
		this.ref=ref;
		this.libelle=libelle;
		this.PHT=PHT;
		this.Taxe=Taxe;
		this.Qte=Qte;		
	}
	public Produit(String ref,String libelle,float PHT,float Taxe) {
		this.ref=ref;
		this.libelle=libelle;
		this.PHT=PHT;
		this.Taxe=Taxe;
	}
	public Produit(String ref,String libelle) {
		this.ref=ref;
		this.libelle=libelle;
	}
	public String toString() {
		 String S="Ref = "+ref+"\t Libelle = "+libelle+"\t prix Produit = "+getPrixfinal()+"\t Quantité en stock = "+Qte;
		 if(solde!=0)
			 S+="\t Solde= "+solde+"%";
		 return S;
	}
	public void DeleteProduit() {
		
	}
	
}
