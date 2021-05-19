
public class Client {
	public static int nbClient;
	private int idC,matricule;
	private String nom,prenom;
	public Client(int matricule,String nom,String prenom) {
		this.nom=nom;
		this.prenom=prenom;
		this.matricule=matricule;
		idC=nbClient++;		
	}
	public int getMatricule() {
		return matricule;
	}


	public String getNom() {
		return nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setIdC(int idC) {
		this.idC = idC;
	}


	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String Save() {
		return idC+"\t"+matricule+"\t"+nom+"\t"+prenom;
	}
	public String toString() {
		return "Id client = "+idC+"\t matricule = "+matricule+"\t nom = "+nom+"\t prenom = "+prenom;
	}
}
