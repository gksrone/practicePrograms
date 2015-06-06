/**
 * 
 */
package rone.practice.april15th2015;

import java.util.Random;

/**
 * @author Ronnie
 *
 */
public class DigitToText {

	public static void main(final String[] args) {
		final Random generator = new Random();

		ConvertToText convertToText = new ConvertToText();		
		
		int n = generator.nextInt(Integer.MAX_VALUE);

		System.out.println(n +" = " + convertToText.convert(n));		
	}
}


