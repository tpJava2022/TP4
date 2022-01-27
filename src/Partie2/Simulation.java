package Partie2;

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
          Thread T1  = new Thread(new VerificateurJouet("Amine",lesJouets[i]));
          Thread T2  = new Thread(new VerificateurJouet("Ahmed", lesJouets[i]));
          
          
          T1.start();  
          T2.start();
          
		}
	}


}
