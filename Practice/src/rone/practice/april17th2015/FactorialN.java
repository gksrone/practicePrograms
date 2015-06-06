/**
 * 
 */
package rone.practice.april17th2015;

import java.util.Scanner;

/**
 * @author Ronnie
 *
 *Valid only till 14! need to revise the logic.
 */
public class FactorialN {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		String factorial = "";
		String result = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number =");
		Long inputNum = Long.parseLong(sc.nextLine());
		Long iter = 2L;
		String carry = "";
		long fact = 0;
		Long n = 0L;

		factorial = factorial+"1";
		if(inputNum == 0 || inputNum == 1){
			System.out.println("factorial = 1");
		}
		else{			
			while(iter <= inputNum) {
				for(int i= 0 ; i < factorial.length(); i++) {
					fact = Character.getNumericValue(factorial.charAt(i));
					fact = (fact * iter) + n;
					if(fact / 10 != 0) {
						n = fact / 10 ;
						carry = n.toString();
						fact = fact % 10;
						result += fact;
					}
					else{
						fact = fact % 10;
						result += fact;
						n = 0L;
						carry = "";
					}
				}
				StringBuilder carryReverse = new StringBuilder(carry);
				carryReverse.reverse();
				factorial = result+carryReverse;
				result = "";
				carry = "";
				n = 0L;
				iter++;
			}
		}
		StringBuilder answer = new StringBuilder(factorial);
		answer.reverse();
		System.out.println(answer);
	}
}
