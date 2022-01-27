package Partie2;

public class Jouet {

	 int num;
	 public Jouet() {
		 
	 }
	public Jouet(int n) {
		this.num = n;
	}
	
	public synchronized  void tuEstVerifiePar(VerificateurJouet V) {
		System.out.println(V.getNom() + " a commencé  de verifier le jouet N°"+num);
		Thread.currentThread();
		try {
		     Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(V.getNom()+ " a finit de verifier le jouet N°"+ num);
	
	}
	
	
}

