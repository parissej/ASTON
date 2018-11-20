package animaux;

import java.math.BigDecimal;;

public enum Remise {

	COURANTE(new BigDecimal("0.05"), "Remise de 5%") {
		public String toString() {
			return "Remise 5%";
		}
	},

	FIDELITE(new BigDecimal("0.07"), "Remise de 7%") {
		public String toString() {
			return "Remise fidelite 7%";
		}
	},

	EXCEPTIONNELLE(new BigDecimal("0.10"), "Remise de 10%") {
		public String toString() {
			return "Remise exceptionnelle 10%";
		}

		public String getLabel() {
			return "Remise à titre exceptionnel de 10%";
		}
	};

	  private final BigDecimal promo;
	  private final String label;
	
	Remise(BigDecimal promo, String label){
		this.promo = promo;
		this.label = label;
	}
	
	public BigDecimal getPromo() {
		return this.promo;
	}

	public String getLabel() {
		return label;
	}

	public BigDecimal calculer(BigDecimal montant) {
	    return montant.multiply(promo).setScale(2, BigDecimal.ROUND_FLOOR);
	}

}
