package gens;

public class EtudiantCycleDeux extends Etudiant{
	
	protected String cursus;
	
	EtudiantCycleDeux(int id, String cursus) {
		super(id);
		setCursus(cursus);
	}

	public String getCursus() {
		return cursus;
	}

	public void setCursus(String cursus) {
		this.cursus = cursus;
	}

	public void afficherNouvelle(){
		afficher();
		System.out.println("Numero d'etudiant : "+getNumetu()+"\nCursus : "+getCursus());
	}
}
