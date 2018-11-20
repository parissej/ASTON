package hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ExIterator {

	public static void main(String[] args) {
		ArrayList<Integer> liste = new ArrayList<>();
		
		liste.addAll(Arrays.asList(1, 2, 3, 4, 5));
		
		for (int i = 0 ; i< liste.size() ; i++) {
			System.out.println(liste.get(i));			
		}
		
		System.out.println("----");
		
		Iterator<Integer> iterator = liste.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		ArrayList<String> listeString = new ArrayList<>();
		listeString.addAll(Arrays.asList("Bloom", "Stella", "Flora", "Musa", "Techna","Layla"));
		
		Iterator<String> iterator2 = listeString.iterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		
		
	}
	
}
