package Partie4;

public class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jouet lesJouets[]= new Jouet[10];
		int j=0;
	
		for (int i=0; i<4; i++)
		{
			lesJouets[i]=new Jouet(i+1);
		}
		VerificateurJouet T1  = new VerificateurJouet("Amine",48,10);
		VerificateurJouet T2  = new VerificateurJouet("Ahmed",45,9);
		VerificateurJouet T3  = new VerificateurJouet("Bachir", 45,5);
		
		while ( j<4 )
		{
			
			  ++j;
          T1.setJ(lesJouets[j]);
           T2.setJ(lesJouets[j]);
         T3.setJ(lesJouets[j]);
         
        
        
		}
		T1.start();  
        T3.start();
        T2.start();

        
	}


}
