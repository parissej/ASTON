package classes;

public class Notes {

	public static void main (String[] args) {
		float note;
		float examen[] = {6,8.5f};
		note = calcNote(examen);
		System.out.println(note);
	}

	private static float calcNote(float[] examen) {
		return (examen[0]/examen[1])*100;
	}
	
}
