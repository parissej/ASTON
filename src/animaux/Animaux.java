package animaux;

public enum Animaux {
	
	// Il faut appeler l'un des constructeurs déclarés :
	KANGOUROU("kangourou", false),
	TIGRE("tigre", false),
	CHIEN("chien", true),
	SERPENT("serpent", false, "tropical"),
	CHAT("chat", true); // <- NB: le point-virgule pour mettre fin à la liste des constantes !
	
	// Membres :
	private final String environnement;
	private final String nom;
	private final boolean domestique;
	
	Animaux(String nom, boolean domestique){
		this(nom, domestique, null); 
		
	}
	
	Animaux(String nom, boolean domestique, String environnement){
		this.nom = nom;
		this.domestique = domestique;
		this.environnement = environnement;
	}
	
	public String getNom(){ return this.nom; }
	
	public String getEnvironnement(){ return this.environnement; }
	
	public boolean isDomestique(){ return this.domestique; }
	
}


