package rone.practice.april4th2015;

import java.util.Random;
import java.util.Scanner;

import rone.helper.utils.HelperUtils;

public class DoughnutProblem {

	static Random r = new Random();

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int t = 0 ; // no. of test cases

		int c = 0 ;  // no. of cats
		int k = 0 ;  // kilograms he can carry
		int w = 0 ;  // weight of each doughnut

		Scanner input = new Scanner(System.in);
		if(input.hasNextLine()) {
			try{
				t = Integer.parseInt(input.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("number format exception in no. of test cases");
			}
		}

		boolean[] canCarry = new boolean[t];
		int i = 0;
		for (; i < t ; i++) {
			if(input.hasNextLine()) {
				String inputNumbers = input.nextLine();
				String[] numbersInString = inputNumbers.split(" ");
				try{
					c = Integer.parseInt(numbersInString[0]);
					k = Integer.parseInt(numbersInString[1]);
					w = Integer.parseInt(numbersInString[2]);

					canCarry[i] = isPossible(c,k,w);
					

				}
				catch(NumberFormatException e){
					System.out.println("number format exception");
				}	        	
			}
			else if(i < t) {
				System.out.println("error no. of input test cases not as per the requirement");
			}
		}

		if(i == t) {
			for(boolean x : canCarry )
			{
				if(x)
					System.out.println("yes");
				else
					System.out.println("no");
			}
			HelperUtils helperUtils = new HelperUtils();
			helperUtils.getRuntimeStatus();
		}

	}

	private static boolean isPossible(int c, int k, int w) {
		if (k >= c*w) 
			return true;
		else
			return false;
	}

	static int rand(){
		int ri = r.nextInt() % 9;
		if ( ri < 0 )
			ri += 2;
		return ri;
	}
}
