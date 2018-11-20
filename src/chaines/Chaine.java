package chaines;

import java.util.StringTokenizer;

public class Chaine {
	
	public String getMonth(int mois) {
		String month ="";
		String listMonth = "Janvier Fevrier Mars Avril Mai Juin Juillet Aout Septembre Octobre Novembre Decembre";
		
		StringTokenizer tokenizer = new StringTokenizer(listMonth);
		
		for (int i = 0 ; i < mois ; i++) {
			month = tokenizer.nextToken();
		}
		
		return month;
	}
	
	
	public static void main(String[] args) {
		String str = new String("J'aime les chats.");
		String felix = new String("Et j'aime les chiens.");
		String str2 = "J'adore aller faire les courses";
		String numero = "020002020 est mon numéro de téléphone";
		System.out.println(str);
		System.out.println(felix);
		System.out.println();
		System.out.println(str2);
		System.out.println(numero);
		System.out.println();
		System.out.println("Mon chat ne fait que dormir. " + str);
		System.out.println(str+ str2);
		
		
		String s = "Mon nom est Personne";
		StringTokenizer str3 = new StringTokenizer(s);
		System.out.println("Nombre de mots : "+str3.countTokens());		
		
		
		Chaine a = new Chaine()	;	
		System.out.println(a.getMonth(8));
		
		
	}
}