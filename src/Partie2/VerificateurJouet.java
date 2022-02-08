package Partie2;



public class VerificateurJouet implements Runnable {

	String Nom;
	Jouet j;
	
	public VerificateurJouet(String n){
		this.Nom = n;
	}
	
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	
	@Override
	public void run() {
		for(int i=0; i<4; i++)
		Simulation.lesJouets[i].tuEstVerifiePar(this);
	}
	

}
