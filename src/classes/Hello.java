package classes;

public class Hello {

	public static void main (String[] args) {

		System.out.println("Coucou le monde !");

		int mesNotes[] = {90,70,80};
		for (int i = 0; i<3 ; i++) {
			System.out.println(mesNotes[i]);
		}

		System.out.println(mesNotes[0]+=1);
		
		int a = 1;
		int b = 7;
		
		if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a < b");			
		}
		
		int noteA = 25;
		int noteB = 70;
		
		if(noteA > 50 && noteB > 50) {
			System.out.println("SUPER !");
		}
		
		if(noteA > 50 || noteB > 50) {
			System.out.println("super !");
		}

		char noteC = noteA > 50 ? 'r' : 'e';
		System.out.println(noteC);
		
		int intA = 15, intB = 10, intC;
		intC = intA & intB;
		System.out.println("intA & intB "+intC);
		System.out.println("intA ^ intB "+ (intA ^ intB));
		System.out.println("intA | intB "+ (intA | intB));
		
		int x = 0;
				
		while (x<5) {x++;System.out.println(x);}
		
		do {x--;System.out.println(x);}while(x>0);
		
		
	}

}
