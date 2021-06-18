
public class Client {
	public static int nbClient; //static car c'est le nombre total des clients
	private int idC,matricule;
	private String nom,prenom;
	public Client(int matricule,String nom,String prenom) { ////le constructeur de classe client
		this.nom=nom;
		this.prenom=prenom;
		this.matricule=matricule;
		setIdC(nbClient++);		//le nombre va etre incrémenté automatiquement
	}
	
	 /// on a définie les getters et les setters 
	
	public int getIdC() {
		return idC;
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

	/// la methode Save permet d'enregistrer les clients dans le fichier sous la forme: id matricule nom prenom
	public String Save() {
		return getIdC()+"\t"+matricule+"\t"+nom+"\t"+prenom;
	}
	
	/// la methode toString retourne le client  :
	
	public String toString() {
		return "Id client = "+getIdC()+"\t matricule = "+matricule+"\t nom = "+nom+"\t prenom = "+prenom;
	}
	
}
