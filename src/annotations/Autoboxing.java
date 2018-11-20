package annotations;

public class Autoboxing {

	public static void main(String[] args) {
		String chaine = "22";
		
		@MonAnnotation(description = "22 plus 3")
		int plus = Integer.parseInt(chaine)+3;
		
		System.out.println(plus);
		
	}
	
}
