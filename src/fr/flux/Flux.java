package fr.flux;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Flux {
	public static void main(String[] args) {
		String prenomEtudiant = "Antoine";
		String nomEtudiant = "Grymonprez";
		String note="A+";
		
		try {
			PrintWriter sortie = new PrintWriter(new FileOutputStream("etudiant.txt"));
			sortie.println(prenomEtudiant);
			sortie.println(nomEtudiant);
			sortie.println(note);
			sortie.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
