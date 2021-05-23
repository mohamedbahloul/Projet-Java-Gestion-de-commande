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
		this.Qte = Qte;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getQte() {
		return Qte;
	}
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
	public float getPrixfinal() {
		return (PHT+Taxe)-(PHT+Taxe)*(solde/100);
	}
	public Produit(String ref,String libelle,float PHT,float Taxe,int Qte) {
		this.ref=ref;
		this.libelle=libelle;
		this.PHT=PHT;
		this.Taxe=Taxe;
		this.Qte=Qte;	
		solde=0;
	}
	public String Save() {
		return ref+"\t"+libelle+"\t"+PHT+"\t"+Taxe+"\t"+Qte+"\t"+solde;
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
