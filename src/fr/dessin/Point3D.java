package fr.dessin;

/**
 *
 * @author Juliette
 *
 */
public class Point3D extends Point2D {

	private int z;

	public Point3D() {
		this(0, 0, 0);
	}

	public Point3D(int vX, int vY, int vZ) {
		super(vX, vY);
		this.setZ(vZ);
	}

	public int getZ() {
		return this.z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public void translater(int dX, int dY, int dZ) {
		this.translater(dX, dY);
		this.setZ(this.getZ() + dZ);
	}

	@Override
	public String toString() {
		return super.toString() + ", " + this.getZ();
	}

}
