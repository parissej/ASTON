package animaux;

public class Chien {

	private String nom, couleur;
	
	public Chien(String nom, String couleur) {
		setCouleur(couleur);
		setNom(nom);
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public String getCouleur() {
		return couleur;
	}
	
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}	
	
	public String toString() {
		return "[ Nom : "+getNom()+"\nCouleur : "+getCouleur()+" ]";
	}
	
}
