package Partie_Finale;


public class VerificateurJouet implements Runnable {

	private String Nom;
	
	private boolean niveau;
	int vitesse;
	
	public VerificateurJouet(String n, boolean ni){
		this.Nom = n;
		this.niveau = ni;
		 
	}
	
	public String getNom() {
		return Nom;
	}
	
	public void setNom(String nom) {
		Nom = nom;
	}
	
	public boolean isNiveau() {
		return niveau;
	}

	public void setNiveau(boolean niveau) {
		this.niveau = niveau;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++)
			Simulation.lesJouets[i].tuEstVerifiePar(this);
		   
		
	}
	

}
