package Partie3;

public class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jouet lesJouets[]= new Jouet[10];
	
		for (int i=0; i<4; i++)
		{
			lesJouets[i]=new Jouet(i+1);
		}
		
		for (int i=0; i<4; i++)
		{
          Thread T1  = new Thread(new VerificateurJouet("Amine",lesJouets[i],48,10));
          Thread T2  = new Thread(new VerificateurJouet("Ahmed", lesJouets[i],45,9));
          Thread T3  = new Thread(new VerificateurJouet("Bachir", lesJouets[i],45,5));
          
          
          T1.start();  
          T2.start();
          T3.start();
          
		}
	}


}
