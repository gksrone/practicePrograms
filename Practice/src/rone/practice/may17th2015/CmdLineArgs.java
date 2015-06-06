/**
 * 
 */
package rone.practice.may17th2015;

/**
 * @author Ronnie
 *
 */
public class CmdLineArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(args[0] + args[1] + args[2]);

		// Immutable nature of the String class : Start
		String expString = "this is an example string";
		
		System.out.println("the length of the string " + expString + "="
				+ expString.length());
		
		expString =  "giving new value to the string";
		
		System.out.println("the length of the string " + expString + "="
				+ expString.length());
		// Immutable nature of the String class : End
		int counter = 0;
		char[] charArray = expString.toCharArray();
		for(char c:charArray){
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				counter++;
			}
		}
		System.out.println(counter);

	}

}
