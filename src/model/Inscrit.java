package model;
// Generated 29 nov. 2018 15:47:49 by Hibernate Tools 5.2.11.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Inscrit generated by hbm2java
 */
public class Inscrit implements java.io.Serializable {

	private InscritId id;
	private Employe employe;
	private Seminaire seminaire;
	private Date dateinscrit;
	private Set participers = new HashSet(0);

	public Inscrit() {
	}

	public Inscrit(InscritId id, Employe employe, Seminaire seminaire, Date dateinscrit) {
		this.id = id;
		this.employe = employe;
		this.seminaire = seminaire;
		this.dateinscrit = dateinscrit;
	}

	public Inscrit(InscritId id, Employe employe, Seminaire seminaire, Date dateinscrit, Set participers) {
		this.id = id;
		this.employe = employe;
		this.seminaire = seminaire;
		this.dateinscrit = dateinscrit;
		this.participers = participers;
	}

	public InscritId getId() {
		return this.id;
	}

	public void setId(InscritId id) {
		this.id = id;
	}

	public Employe getEmploye() {
		return this.employe;
	}

	public void setEmploye(Employe employe) {
		this.employe = employe;
	}

	public Seminaire getSeminaire() {
		return this.seminaire;
	}

	public void setSeminaire(Seminaire seminaire) {
		this.seminaire = seminaire;
	}

	public Date getDateinscrit() {
		return this.dateinscrit;
	}

	public void setDateinscrit(Date dateinscrit) {
		this.dateinscrit = dateinscrit;
	}

	public Set getParticipers() {
		return this.participers;
	}

	public void setParticipers(Set participers) {
		this.participers = participers;
	}

}
