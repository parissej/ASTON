package starwars;

public class RadioSpatiale {

	public static void main(String[] args) {

		UtilisateurForce utilisateur;
		
		utilisateur = new ChevalierJedi();
		
		utilisateur.utilisateurForce();
		utilisateur.serviteurDe();

		utilisateur = new SeigneurSith();
		
		utilisateur.utilisateurForce();
		utilisateur.serviteurDe();

	}

}
