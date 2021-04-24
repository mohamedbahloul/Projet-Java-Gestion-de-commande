
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
	public String getRef() {
		return ref;
	}
	public String getLibelle() {
		return libelle;
	}
	public int modifyQte(int n) {
			Qte += n;
			return Qte;		
	}
	
	
	public float getTauxReduction() {
			return (PHT+Taxe)*(solde/100);
	}
	public float getPrixfinal() {
		return (PHT+Taxe)+(PHT+Taxe)*(solde/100);
	}
	public Produit(String ref,String libelle,float PHT,float Taxe,int Qte) {
		this.ref=ref;
		this.libelle=libelle;
		this.PHT=PHT;
		this.Taxe=Taxe;
		this.Qte=Qte;		
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
