package reseau;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

class DoubleReader extends FilterReader {

	private int lastChar = -1;

	public DoubleReader(Reader r) {
		super(r);
	}

	@Override 
	public int read() throws IOException {
		if(lastChar != -1) {
			int r = lastChar;
			lastChar = -1; return r;
		} 		
		lastChar = super.read(); return lastChar;	
	}

}

public class Demo {
	public static void main(String args[]) {
		
		//MISE EN MEMOIRE TAMPON D'UNE CHAINE DE CHARACTERES
		StringBuffer sb = new StringBuffer("Test");
		sb.append(" String Buffer");
		System.out.println(sb);
	}
}