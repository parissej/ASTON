package animaux;

import java.math.BigDecimal;

public class Marche {

	public static void main(String[] args) {
	    BigDecimal montant = new BigDecimal("159.99");

	    for (Remise remise : Remise.values()) {
	      System.out.println(remise + " : " + remise.calculer(montant));
	    }
	  }
	
	
}
