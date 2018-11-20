package annotations;

public class ExFunctionInterface {


	@FunctionalInterface
	interface Calculer {
		int calcul(int i, int j);
		// UNE SEULE METHODE ABSTRAITE int estimer();
	}

	public int calculerService(int i, int j, Calculer calculer) {
		return calculer.calcul(i, j);
	}

	public static void main(String[] args) {

		ExFunctionInterface client = new ExFunctionInterface();
		
		//Client 1
		int rep = client.calculerService(3,4,(p,q) -> p*q);
		System.out.println("Reponse : " + rep);
		
		//Client 2
		rep = client.calculerService(3,4,(p,q) -> p+q);
		System.out.println("Reponse : " + rep);
		
		//Client 3
		rep = client.calculerService(3,4,(p,q) -> p-q);
		System.out.println("Reponse : " + rep);
		
		//Client 4
		rep = client.calculerService(20,4,(p,q) -> p/q);
		System.out.println("Reponse : " + rep);
		
	}


}