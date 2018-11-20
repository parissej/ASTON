package classes;

class EauMinerale {
	private String s;
	EauMinerale() {
		System.out.println("EauMinerale()");
		s = new String("Construite");
	}
	public String toString() { return s; }
}