package Partie3;


public class VerificateurJouet implements Runnable {

	String Nom;
	
	int niveau;
	int vitesse;
	
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
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++)
			Simulation.lesJouets[i].tuEstVerifiePar(this);
		   
		
	}
	

}
