package feux;

public class FeuxTricolore {

	private CouleurFeux couleur;

	public FeuxTricolore() {
		setCouleur(CouleurFeux.VERT);
	}
	
	public FeuxTricolore(CouleurFeux color) {
		setCouleur(color);
	}

	public CouleurFeux getCouleur() {
		return couleur;
	}

	public void setCouleur(CouleurFeux couleur) {
		this.couleur = couleur;
	}
	
	
	public void afficherMessageCouleur(CouleurFeux couleur) {

		switch (couleur) {
		case ROUGE:
			System.out.println(CouleurFeux.arret());
			break;

		case ORANGE:
			System.out.println(CouleurFeux.ralentir());
			break;

		case VERT:
			System.out.println(CouleurFeux.avancer());
			break;

		default:
			break;
		}

	}

	public static void main(String[] args) {

		FeuxTricolore feux = new FeuxTricolore();

		for (CouleurFeux couleur : CouleurFeux.values()) {
			feux.afficherMessageCouleur(couleur);
		}
		
	}

}
