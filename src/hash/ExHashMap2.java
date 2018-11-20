package hash;

import java.util.HashMap;
import java.util.Iterator;

public class ExHashMap2 {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();

		map.put("Grymonprez", "Antoine");
		map.put("Parisseaux", "Juliette");
		map.put("Guille", "Théo");
		map.put("Merino", "Lucas");	

		System.out.println(map);	

		Iterator<String> iterator = map.values().iterator();
				
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		map.put("Parisseaux", "Claire");
		map.put("Huleux", "Claire");
		System.out.println(map);	
		
		Iterator<String> iterator2 = map.keySet().iterator();
		
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		
	}
	
}
