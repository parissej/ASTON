package model;
// Generated 29 nov. 2018 15:47:49 by Hibernate Tools 5.2.11.Final

import java.math.BigDecimal;

/**
 * PrimeReleveId generated by hbm2java
 */
public class PrimeReleveId implements java.io.Serializable {

	private int numemp;
	private String nomemp;
	private String prenomemp;
	private String poste;
	private BigDecimal salaire;
	private BigDecimal prime;
	private String codeprojet;
	private Integer superieur;

	public PrimeReleveId() {
	}

	public PrimeReleveId(int numemp, String nomemp, String prenomemp, String poste, BigDecimal salaire) {
		this.numemp = numemp;
		this.nomemp = nomemp;
		this.prenomemp = prenomemp;
		this.poste = poste;
		this.salaire = salaire;
	}

	public PrimeReleveId(int numemp, String nomemp, String prenomemp, String poste, BigDecimal salaire,
			BigDecimal prime, String codeprojet, Integer superieur) {
		this.numemp = numemp;
		this.nomemp = nomemp;
		this.prenomemp = prenomemp;
		this.poste = poste;
		this.salaire = salaire;
		this.prime = prime;
		this.codeprojet = codeprojet;
		this.superieur = superieur;
	}

	public int getNumemp() {
		return this.numemp;
	}

	public void setNumemp(int numemp) {
		this.numemp = numemp;
	}

	public String getNomemp() {
		return this.nomemp;
	}

	public void setNomemp(String nomemp) {
		this.nomemp = nomemp;
	}

	public String getPrenomemp() {
		return this.prenomemp;
	}

	public void setPrenomemp(String prenomemp) {
		this.prenomemp = prenomemp;
	}

	public String getPoste() {
		return this.poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public BigDecimal getSalaire() {
		return this.salaire;
	}

	public void setSalaire(BigDecimal salaire) {
		this.salaire = salaire;
	}

	public BigDecimal getPrime() {
		return this.prime;
	}

	public void setPrime(BigDecimal prime) {
		this.prime = prime;
	}

	public String getCodeprojet() {
		return this.codeprojet;
	}

	public void setCodeprojet(String codeprojet) {
		this.codeprojet = codeprojet;
	}

	public Integer getSuperieur() {
		return this.superieur;
	}

	public void setSuperieur(Integer superieur) {
		this.superieur = superieur;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrimeReleveId))
			return false;
		PrimeReleveId castOther = (PrimeReleveId) other;

		return (this.getNumemp() == castOther.getNumemp())
				&& ((this.getNomemp() == castOther.getNomemp()) || (this.getNomemp() != null
						&& castOther.getNomemp() != null && this.getNomemp().equals(castOther.getNomemp())))
				&& ((this.getPrenomemp() == castOther.getPrenomemp()) || (this.getPrenomemp() != null
						&& castOther.getPrenomemp() != null && this.getPrenomemp().equals(castOther.getPrenomemp())))
				&& ((this.getPoste() == castOther.getPoste()) || (this.getPoste() != null
						&& castOther.getPoste() != null && this.getPoste().equals(castOther.getPoste())))
				&& ((this.getSalaire() == castOther.getSalaire()) || (this.getSalaire() != null
						&& castOther.getSalaire() != null && this.getSalaire().equals(castOther.getSalaire())))
				&& ((this.getPrime() == castOther.getPrime()) || (this.getPrime() != null
						&& castOther.getPrime() != null && this.getPrime().equals(castOther.getPrime())))
				&& ((this.getCodeprojet() == castOther.getCodeprojet()) || (this.getCodeprojet() != null
						&& castOther.getCodeprojet() != null && this.getCodeprojet().equals(castOther.getCodeprojet())))
				&& ((this.getSuperieur() == castOther.getSuperieur()) || (this.getSuperieur() != null
						&& castOther.getSuperieur() != null && this.getSuperieur().equals(castOther.getSuperieur())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNumemp();
		result = 37 * result + (getNomemp() == null ? 0 : this.getNomemp().hashCode());
		result = 37 * result + (getPrenomemp() == null ? 0 : this.getPrenomemp().hashCode());
		result = 37 * result + (getPoste() == null ? 0 : this.getPoste().hashCode());
		result = 37 * result + (getSalaire() == null ? 0 : this.getSalaire().hashCode());
		result = 37 * result + (getPrime() == null ? 0 : this.getPrime().hashCode());
		result = 37 * result + (getCodeprojet() == null ? 0 : this.getCodeprojet().hashCode());
		result = 37 * result + (getSuperieur() == null ? 0 : this.getSuperieur().hashCode());
		return result;
	}

}
