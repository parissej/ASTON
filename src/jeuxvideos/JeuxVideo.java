package jeuxvideos;

public class JeuxVideo {

	private String[] consoles;
	private String titre;

	public JeuxVideo(String[] consoles, String titre) {
		this.consoles = consoles;
		this.titre = titre;
	}

	public String[] getConsoles() {
		return this.consoles;
	}

	public void setConsoles(String[] consoles) {
		this.consoles = consoles;
	}

	public String getTitre() {
		return this.titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	@Override
	public String toString() {
		String tostring = this.getTitre() + "\nConsoles : ";

		for (int i = 0; i < this.getConsoles().length; i++) {
			tostring += this.getConsoles()[i] + " ";
		}

		return tostring;
	}

	public boolean equals(JeuxVideo obj) {
		return this.getTitre() == obj.getTitre();
	}

}
