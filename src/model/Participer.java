package model;
// Generated 29 nov. 2018 15:47:49 by Hibernate Tools 5.2.11.Final

/**
 * Participer generated by hbm2java
 */
public class Participer implements java.io.Serializable {

	private ParticiperId id;
	private Inscrit inscrit;

	public Participer() {
	}

	public Participer(ParticiperId id, Inscrit inscrit) {
		this.id = id;
		this.inscrit = inscrit;
	}

	public ParticiperId getId() {
		return this.id;
	}

	public void setId(ParticiperId id) {
		this.id = id;
	}

	public Inscrit getInscrit() {
		return this.inscrit;
	}

	public void setInscrit(Inscrit inscrit) {
		this.inscrit = inscrit;
	}

}
