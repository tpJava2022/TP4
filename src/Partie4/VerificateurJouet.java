package Partie4;



public class VerificateurJouet extends Thread {

	private String Nom;
	private Jouet j;
	private int niveau;
	private int vitesse;
	public VerificateurJouet(String n, int niv, int vit){
		this.Nom = n;
		
	}
	
	public Jouet getJ() {
		return j;
	}

	public void setJ(Jouet j) {
		this.j = j;
	}

	public VerificateurJouet(String n, Jouet J, int niv, int vit){
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
