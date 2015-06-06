/**
 * 
 */
package rone.practice.april18th2015;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ronnie
 *
 */
public class WaterCups {


	static List<Integer> stepsReq = new ArrayList<Integer>();

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int testCases = 0;
		int waterInA = 0;
		int waterInB = 0;
		int requirement = 0;
		Scanner sc = new Scanner(System.in);
		if(sc.hasNextLine()){
			testCases =  sc.nextInt();
		}

		for(int i = 0 ; i < testCases ; i++) {
			waterInA = sc.nextInt();
			waterInB = sc.nextInt();
			requirement = sc.nextInt();
			stepsReq.add(getSteps(waterInA, waterInB, requirement));
			printAnswer();
		}
		
		sc.close();
	}

	private static void printAnswer() {
		for(int itr : stepsReq ){
			System.out.println(itr);
		}

	}

	private static int getSteps(int waterInA, int waterInB, int requirement) {
		int steps = 0;
		int require = 0;
		if(waterInA - waterInB == 0 && requirement != 0){
			return -1;
		}
		else if(waterInA == waterInB && requirement == waterInA){
			return 1;
		}
		else if(waterInA - waterInB == 0 && requirement == 0){
			return 0;
		}
		else{
			if(waterInA > waterInB && requirement > waterInB ){
				while(require != requirement){
					steps++;   //  fill water in the cup 
					require += waterInB;
					steps ++; //  transferring water from the cup
				}
				return steps;
			}
			if(waterInA > waterInB && requirement == waterInB ){
				return steps++;
			}
			if(waterInA < waterInB && requirement > waterInA ){
				while(require != requirement){
					steps++;   //  fill water in the cup 
					require += waterInA;
					steps ++; //  transferring water from the cup
				}
				return steps;
			}
			if(waterInA > waterInB && requirement == waterInA ){
				return steps++;
			}
			else
				return -1;
		}
	}
}