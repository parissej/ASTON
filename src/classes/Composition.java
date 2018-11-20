package classes;

public class Composition {
	private String valve1, valve2, valve3, valve4;
	EauMinerale source;
	int i;
	float f;
	void print() {
		System.out.println("valve1 = " + valve1);
		System.out.println("valve2 = " + valve2);
		System.out.println("valve3 = " + valve3);
		System.out.println("valve4 = " + valve4);
		System.out.println("i = " + i);
		System.out.println("f = " + f);
		System.out.println("source = " + source);
	}
	public static void main(String[] args) {
		Composition x = new Composition();
		x.print();
	}
}