package Partie_Finale;

public class Jouet {

	 int num;
	 boolean deja_verif = false;
	 boolean verif_sup = false;
	 public Jouet() {
		 
	 }
	public Jouet(int n) {
		this.num = n;
		
	}
	
	public synchronized  void tuEstVerifiePar(VerificateurJouet V) {
		if(V.isNiveau()==true)
		{
			while(this.deja_verif == false)
			{
				try {
					this.wait();
					
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(V.getNom() + " a commencé  de verifier le jouet N°"+num);
			Thread.currentThread();
			try {
			     Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(V.getNom()+ " a finit de verifier le jouet N°"+ num);
			this.verif_sup= true;
			
		}
		else {
			
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
	    
	    this.notify();
		}
		
	}
		}
	
}


