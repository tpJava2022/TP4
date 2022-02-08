package Partie4;

import java.util.ArrayList;
import java.util.List;

public class Jouet {

	 private int num;
	 private  boolean deja_verif = false;
	 List<VerificateurJouet> vj = new ArrayList<VerificateurJouet>();
	 
	 public Jouet() {
		 
	 }
	public Jouet(int n) {
		this.num = n;
		
	}
	
	public synchronized void tuEstVerifiePar(VerificateurJouet V) {
		//Thread.currentThread();
		if(vj.size() == 0) {
		System.out.println(V.getNom() + " a commencé  de verifier le jouet N°"+num);
		
			try {
				
				 Thread.sleep(2000);
					
				 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(V.getNom()+ " a finit de verifier le jouet N°"+ num);
		vj.add(V);
		try {
			this.wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		else {
			this.notify();
			System.out.println(V.getNom() + " a commencé  de verifier le jouet N°"+num);
			
			try {
				
				 Thread.sleep(2000);
					
				 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println(V.getNom()+ " a finit de verifier le jouet N°"+ num);
		vj.add(V);
		
		}
		//V.notifyAll();
	   
		
	}
	
	
}

