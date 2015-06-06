/**
 * 
 */
package rone.practice.april4th2015;

/**
 * @author Ronnie
 *
 */
public class BitRecurssion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 

		getStrings("", 3 ); // initial call
	}

	 static void getStrings(String s, int digitsLeft) {
		
	   if( digitsLeft == 0 ) // the length of string is n
	     System.out.println(s);
	   else
	   {
	      getStrings( s + "0", digitsLeft - 1 );
	      getStrings( s + "1", digitsLeft - 1 );
	   }
	}
	}