
public class QteProd {
	//dans la classe qte produit on défine chaque produit stocké avec sa qte dans une liste 
	
	private Produit produit;
	private int qte;
	public QteProd(Produit produit,int qte) {this.produit=produit;this.qte=qte;}
	public Produit getProduit() {
		return produit;
	}
	
	public void setProduit(Produit p) {
		produit = p;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	
}
