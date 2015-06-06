/**
 * 
 */
package rone.practice.day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ronnie
 *
 */
public class RegexPractice {

	private static String EXAMPLE_STRING = "This is my small example";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Removes whitespace between a word character and . or ,
		String pattern2 = "(\\w)(\\s+)([\\.,])";
		System.out.println(EXAMPLE_STRING.replaceAll(pattern2, "$1$3"));


		String line = "This order was placed for QT3000! OK?";
		String pattern = "(.*)(\\d+)(.*)";

		// Create a Pattern object
		Pattern r = Pattern.compile(pattern);

		// Now create matcher object.
		Matcher m = r.matcher(line);
		System.out.println("the group count is " + m.groupCount());
		if (m.find( )) {
			System.out.println("Found value: " + m.group(0) );
			System.out.println("Found value: " + m.group(1) );
			System.out.println("Found value: " + m.group(2) );
		} else {
			System.out.println("NO MATCH");
		}
		
		
	}

}
