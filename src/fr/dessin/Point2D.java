package fr.dessin;

/**
 *
 * Exercices 2, 3, 4 et 5
 * 
 * @author Juliette
 *
 */
public class Point2D {
	private int x, y;
	private static int compteur;

	public Point2D() {
		this(0, 0);
	}

	public Point2D(int vX, int vY) {
		this.setX(vX);
		this.setY(vY);
		Point2D.compteur++;
	}

	@Override
	public String toString() {
		return this.getX() + ", " + this.getY();
	}

	public void afficher() {
		System.out.println("[" + this.toString() + "]");
	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void translater(int dX, int dY) {
		this.setX(this.getX() + dX);
		this.setY(this.getY() + dY);
	}

	public static int getCompteur() {
		return Point2D.compteur;
	}

}
