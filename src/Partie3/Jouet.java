package Partie3;

public class Jouet {

	 int num;
	 boolean deja_verif = false;
	 public Jouet() {
		 
	 }
	public Jouet(int n) {
		this.num = n;
		
	}
	
	public synchronized  void tuEstVerifiePar(VerificateurJouet V) {
		if(this.deja_verif == false) {
		System.out.println(V.getNom() + " a commencé  de verifier le jouet N°"+num);
		Thread.currentThread();
		try {
		     Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(V.getNom()+ " a finit de verifier le jouet N°"+ num);
	    this.deja_verif = true;
		}
	}
	
	
}

