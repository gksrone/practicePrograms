/**
 * Your program is to use the brute-force approach in order to find the Answer to Life,
 * the Universe, and Everything.
 * More precisely... rewrite small numbers from input to output.
 * Stop processing input after reading in the number 42.
 * All numbers at input are integers of one or two digits.
 */
package rone.practice.april4th2015;

import java.util.*;
import java.util.List;
import java.util.Scanner;

import rone.helper.utils.HelperUtils;

/**
 * @author Ronnie
 *
 */
public class LifeTheUniverse {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(); // use of diamond operator
		Scanner input = new Scanner(System.in);
		int j = 0;
		while(input.hasNextLine()) {
			try{
				j = Integer.parseInt(input.nextLine());
				if(j != 42) {
					numbers.add(j);				
				}
				else
					break;
			} catch(NumberFormatException e) {
				System.out.println("number format exception in no. of test cases");
			}
		}
		
		for(Integer i : numbers){
			System.out.println(i);
		}
		
		HelperUtils helperUtils = new HelperUtils();
		helperUtils.getRuntimeStatus();

	}

}
