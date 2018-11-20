package moyenne;

public class Lyceen extends Eleve{

	private String admission = "";
	
	public Lyceen(int noteAnglais, int noteMaths) {
		setNoteAnglais(noteAnglais);
		setNoteMaths(noteMaths);
		evaluerAdmission();
	}
	
	public int getNoteMaths() {
		return noteMaths;
	}
	
	public void setNoteMaths(int noteMaths) {
		this.noteMaths = noteMaths;
	}
	
	public int getNoteAnglais() {
		return noteAnglais;
	}
	
	public void setNoteAnglais(int noteAnglais) {
		this.noteAnglais = noteAnglais;
	}
	
	public int getMoyenne() {
		return (getNoteAnglais()+getNoteMaths())/2;
	}
	
	public String estAdmis() {
		return admission;
	}
	
	public void evaluerAdmission() {
		int moyenne = getMoyenne();
		this.admission = ( moyenne > 10 ? "ADMIS"  : "NON ADMIS");
	}
	
	public String toString() {
		return ""+estAdmis()+"\n\nMoyenne : "+getMoyenne()+"\n\nAnglais : "+getNoteAnglais()+"\nMaths : "+getNoteMaths();
	}
	
}
