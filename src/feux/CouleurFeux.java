package feux;


public enum CouleurFeux {
	ROUGE ("rouge"), 
	ORANGE("orange"), 
	VERT ("vert");
	
	String little;
	
	private CouleurFeux(String little) {
		this.little = little;
	}
	
	public static String arret() {
		return "On s'arrête au feu rouge !";
	}
	
	public static String ralentir() {
		return "On ralentit au feu orange !";
	}
	
	public static String avancer() {
		return "On avance au vert !";
	}
	
}
