/**
 * 
 */
package rone.practice.may17th2015;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ronnie
 *
 */
public class CheckForDataTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			String value =  sc.next();	
			if (checkForInt(value)) {
				continue;
			}
			if (checkForBoolean(value)) {
				continue;
			}
			System.out.println("string data type =" + value);				
		}
		sc.close();
	}
	/**
	 * check for boolean.
	 * @param value
	 * @return
	 */
	private static boolean checkForBoolean(String value) {
		try {
			if(value.equalsIgnoreCase("true") || value.equalsIgnoreCase("false")) {
				System.out.println("boolean data type = " + value);
				return true;
			} 
		}catch(Exception ex) {
			Logger log = Logger.getGlobal();
			log.log(Level.INFO, "not a boolean");			
		}

		return false;
	}
	/**
	 * checks for value of integer.
	 * @param value
	 */
	private static boolean checkForInt(String value) {
		int val = 0;
		try {
			val = new Integer(value);
		} catch(Exception ex) {
			//System.out.println("number not an integer");
			return false;
		}
		System.out.println("integer data type = " + val);
		return true;
	}

}
