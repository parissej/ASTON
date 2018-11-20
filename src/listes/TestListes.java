package listes;

import java.util.ArrayList;

public class TestListes {

	public static void main(String[] args) {
		ArrayList<String> tableau = new ArrayList<>();
		System.out.println(tableau.toString()+" -> "+tableau.size());
		
		
		ArrayList<Integer> tableauInt = new ArrayList<>();
		tableauInt.add(45);
		System.out.println(tableauInt.toString()+" -> "+tableau.size());	
		tableauInt.set(0, 23);
		System.out.println(tableauInt.toString()+" -> "+tableau.size());	
	}
	
}
