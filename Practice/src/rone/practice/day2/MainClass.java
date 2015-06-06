/**
 * 
 */
package rone.practice.day2;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ronnie
 * @since 12th April 2015
 *
 */
public class MainClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Program program = new Program();
		int[] a = {-1,2,4,6,2,333,30,98,2,3,-90,-0};
		int[] b = program.retainPositiveNumbers(a);
		for(int num : b){
		System.out.println(num);
		}*/

		/*Program2 program2 = new Program2();
		String s = program2.capitalizeFirstLetters("    hello to 6y hek GauraV sOod 9world");*/

		/*Program3 program3 = new Program3();
		int n = program3.countWords("hello to 6y hek GauraV sOod 9world");
		System.out.println(n);*/
		
		Program4 program4 = new Program4();
		List<Integer> primeNumbers = new ArrayList<Integer>();
		primeNumbers = program4.getPrimeNumbers(10, 20);
		for (Integer i : primeNumbers) {
			int num = i.intValue();
			System.out.println(num);
		}
	}
}
