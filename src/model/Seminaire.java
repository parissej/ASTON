package model;
// Generated 29 nov. 2018 15:47:49 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Seminaire generated by hbm2java
 */
public class Seminaire implements java.io.Serializable {

	private String codesemi;
	private Cours cours;
	private Date datedebutsem;
	private Set inscrits = new HashSet(0);

	public Seminaire() {
	}

	public Seminaire(String codesemi, Cours cours, Date datedebutsem) {
		this.codesemi = codesemi;
		this.cours = cours;
		this.datedebutsem = datedebutsem;
	}

	public Seminaire(String codesemi, Cours cours, Date datedebutsem, Set inscrits) {
		this.codesemi = codesemi;
		this.cours = cours;
		this.datedebutsem = datedebutsem;
		this.inscrits = inscrits;
	}

	public String getCodesemi() {
		return this.codesemi;
	}

	public void setCodesemi(String codesemi) {
		this.codesemi = codesemi;
	}

	public Cours getCours() {
		return this.cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
	}

	public Date getDatedebutsem() {
		return this.datedebutsem;
	}

	public void setDatedebutsem(Date datedebutsem) {
		this.datedebutsem = datedebutsem;
	}

	public Set getInscrits() {
		return this.inscrits;
	}

	public void setInscrits(Set inscrits) {
		this.inscrits = inscrits;
	}

}
