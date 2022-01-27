
public class Simulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Thread T1  = new Thread(new VerificateurJouet("Amine"));      
          Thread T2  = new Thread(new VerificateurJouet("Ahmed"));
          
           T1.start();
          T2.start();
	}

}
