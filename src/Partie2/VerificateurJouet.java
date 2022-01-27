package Partie2;



public class VerificateurJouet implements Runnable {

	String Nom;
	Jouet j;
	public VerificateurJouet(String n, Jouet J){
		this.Nom = n;
		this.j=J; 
	}
	
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		j.tuEstVerifiePar(this);
	}
	

}
