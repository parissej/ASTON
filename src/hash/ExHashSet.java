package hash;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class ExHashSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		
		set.addAll(Arrays.asList("Juliette","Claire","Antoine","Théo","Lucas","Loïc"));
		
		Iterator<String> iterator = set.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
				
	}
	
}
