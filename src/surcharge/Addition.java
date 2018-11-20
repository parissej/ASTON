package surcharge;

public class Addition implements Calcul {

	/* (non-Javadoc)
	 * @see surcharge.Calcul#additionner(int, int)
	 */
	@Override
	public int additionner(int a, int b) {
		return a+b;
	}
	
	/* (non-Javadoc)
	 * @see surcharge.Calcul#additionner(int, int, int)
	 */
	@Override
	public int additionner(int a, int b, int c) {
		return a+b+c;
	}
	
	/* (non-Javadoc)
	 * @see surcharge.Calcul#additionner(java.lang.Double, java.lang.Double)
	 */
	@Override
	public Double additionner(Double a, Double b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		
		Calcul premiere = new Addition();
		
		Double a = 5.0;
		Double b = 15.5;
		System.out.println(premiere.additionner(a,b));
		
		int c = 7;
		int d = 16;
		System.out.println(premiere.additionner(c,d));
		

		int e = 3;
		System.out.println(premiere.additionner(c,d,e));
	}
	
}
