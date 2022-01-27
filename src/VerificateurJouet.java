
public class VerificateurJouet implements Runnable {

	String Nom;
	
	public VerificateurJouet(String n){
		this.Nom = n;
	}
	public void verifJouet(int n ) {
		System.out.println(this.Nom + " a commencé  de verifier le jouet N°"+n);
		Thread.currentThread();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.Nom+ " a finit de verifier le jouet N°"+ n);
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
		for(int i=0; i<10; i++ ) {
			this.verifJouet(i+1);
		}
	}
	

}
