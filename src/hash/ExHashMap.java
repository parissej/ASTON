package hash;

import java.util.HashMap;

public class ExHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		map.put("ARRAS", 62000);
		map.put("PARIS", 93000);
		map.put("BORDEAUX", 33000);
		map.put("TOULON", 83000);
		
		System.out.println(map);
		
		System.out.println(map.get("PARIS"));
		
		map.remove("PARIS");
		
		System.out.println(map);
				
	}
	
}
