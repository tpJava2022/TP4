package Partie_Finale;
public class Simulation {

	public static Jouet[] lesJouets = new Jouet[10]; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		for (int i=0; i<4; i++)
		{
			Simulation.lesJouets[i]=new Jouet(i+1);
		}
		
		
		 Thread T1  = new Thread(new VerificateurJouet("Amine",false));
         Thread T2  = new Thread(new VerificateurJouet("Ahmed", false));
         Thread T3  = new Thread(new VerificateurJouet("Bachir", true));
         
		
          T1.start();  
          T2.start();
          T3.start();
          
		
	}

	
}


