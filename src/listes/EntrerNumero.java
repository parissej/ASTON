package listes;

import java.util.ArrayList;
import java.util.Scanner;

public class EntrerNumero {

	static Scanner lecteur = new Scanner(System.in);
	static ArrayList<Integer> tab = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		System.out.println("Entrer un num�ro de votre choix, entrer 0 pour finir");
		int in = lecteur.nextInt();
		
		while (in!=0) {
			tab.add(in);
			in = lecteur.nextInt();
		}
		
		//System.out.println("Valeurs r�cup�r�es : "+tab);
		System.out.println("-------------");
		
		for(int i : tab) {
			System.out.println(i);
		}
		
		System.out.println("Entrer un num�ro � supprimer de la liste pr�c�dente");

		int out = lecteur.nextInt();
		if(tab.contains(out)) {
			tab.remove(tab.indexOf(out));
		} else {
			System.out.println("Ce num�ro n'est pas contenu dans la liste !");
		}
		
		System.out.println("-------------");
		for(int i : tab) {
			System.out.println(i);
		}
		
	}
	
}
