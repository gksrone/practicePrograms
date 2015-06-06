/**
 * 
 */
package rone.practice.may17th2015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Ronnie
 *
 */
public class AllCombnOfString {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String initial = "catdog";

		char[] allCharOfStr = initial.toCharArray();

		List<Character> allChars = new ArrayList<Character>();
		for(char c : allCharOfStr){
			allChars.add(c);
		}

		// Logic for getting all the combinations: START

		getAllStrings(allChars);		

		// Logic for getting all the combinations: END
	}

	private static void getAllStrings(List<Character> allChars) {
		
		for(Character c : allChars){
			List<Character> allChars1 = new ArrayList<Character>();
			allChars1.addAll(allChars);
			allChars1.remove(c);
			String str = Character.toString(c) + nextChar(allChars1);
			System.out.println(str);
		}

	}

	private static String nextChar(List<Character> allChars) {
		if(!allChars.isEmpty()){
			for(Character c : allChars){
				List<Character> allChars1 = new ArrayList<Character>();
				allChars1.addAll(allChars);
				allChars1.remove(c);
				return Character.toString(c) + nextChar(allChars1);
			}
		}
		return "";
	}
}
