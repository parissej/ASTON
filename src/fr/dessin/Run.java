package fr.dessin;

public class Run {

	public static void main(String[] args) {

		System.out.println("/*** POINT2D ***/");
		Point2D p1 = new Point2D(4, 34);

		Point2D p2 = new Point2D();
		p2.setX(7);
		p2.setY(15);

		Point2D p3 = new Point2D();

		p1.afficher();
		p2.afficher();
		p3.afficher();

		p1.translater(2, 2);
		p2.translater(5, 15);

		p1.afficher();
		p2.afficher();
		p3.afficher();

		System.out.println(Point2D.getCompteur());

		System.out.println("/*** POINT3D ***/");

		Point3D p4 = new Point3D(1, 2, 3);

		Point3D p5 = new Point3D();
		p5.setX(10);
		p5.setY(20);
		p5.setZ(30);

		Point3D p6 = new Point3D();

		p4.afficher();
		p5.afficher();
		p6.afficher();

		p4.translater(2, 2, 2);
		p5.translater(5, 5, 5);

		p4.afficher();
		p5.afficher();
		p6.afficher();

		System.out.println(Point2D.getCompteur());

	}

}
