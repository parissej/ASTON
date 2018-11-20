package animaux;

public class PlaceAuxAnimaux {

	public static void main(String[] args) {
		
		Animaux bebete = Animaux.TIGRE;
		
		System.out.println("L'animal est un "+bebete.getNom());
		System.out.println(bebete.isDomestique()?"(domestique)":"(sauvage)");
		String env = bebete.getEnvironnement();
		if(env!=null) {
			System.out.println(" vivant dans un milieu "+env);
		}
		
	}
	
}
