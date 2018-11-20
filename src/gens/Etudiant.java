package gens;

public class Etudiant extends Personne {

	protected int numetu;

	Etudiant (int id){
		setNumetu(id);
	}

	public int getNumetu() {
		return numetu;
	}

	public void setNumetu(int numetu) {
		this.numetu = numetu;
	}

	public void afficher() {		
		System.out.println("<-- Etudiant -->\nClasse d'etudiant : "+getNumetu());		
	}	
 
}
