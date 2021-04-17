
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
}
