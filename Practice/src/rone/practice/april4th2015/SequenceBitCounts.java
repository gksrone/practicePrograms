/**
 * 
 */
package rone.practice.april4th2015;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Ronnie
 *
 */
public class SequenceBitCounts {

	static List<String> allBitCombos = new ArrayList<>();
	static HashMap<Integer,Integer> countOfBitStrings = new HashMap<>();

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int t = 0 ; // no. of test cases
		int sno = 0 ; // serial number of test case
		int length = 0 ; // length of bit string
		int adjBits = 0 ; // numbers of 1s or 0s appearing adjacently
		int occurrences = 0 ; // number of occurences of adjBits

		Scanner input = new Scanner(System.in);
		if(input.hasNextLine()) {
			try{
				t = Integer.parseInt(input.nextLine());
			} catch(NumberFormatException e) {
				System.out.println("number format exception in no. of test cases");
			}
		}

		for(int i = 0; i < t ; i++){
			if(input.hasNextLine()) {
				String inputNumbers = input.nextLine();
				String[] numbersInString = inputNumbers.split(" ");
				try{
					sno = Integer.parseInt(numbersInString[0]);
					length = Integer.parseInt(numbersInString[1]);
					adjBits = Integer.parseInt(numbersInString[2]);
					allBitCombos = getAllBitCombos(length);
					occurrences = numberOfOccurs(allBitCombos,adjBits);
					countOfBitStrings.put(sno,occurrences);
				} catch(NumberFormatException e) {
					System.out.println("number format exception in no. of test cases");
				}

			}
		}		
		printCount(countOfBitStrings);
	}

	/**
	 * 
	 * @param countOfBitStrings
	 */
	private static void printCount(HashMap<Integer, Integer> countOfBitStrings) {
		for(Map.Entry<Integer, Integer> entry : countOfBitStrings.entrySet()) {
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}		
	}

	/**
	 * 
	 * @param allBitCombos
	 * @param adjBits
	 * @return
	 */
	private static int numberOfOccurs(List<String> allBitCombos,
			int adjBits) {
		int count = 0;
		for(String bitString : allBitCombos){
			if(bitString.contains(getAdjBits(adjBits))){
				count++;
			}
		}
		return count;
	}

	/**
	 * 
	 * @param adjBits
	 * @return
	 */
	private static String getAdjBits(int adjBits) {
		String adjBitString = "";
		for(int i = 0 ; i < adjBits ; i++) {
			adjBitString = adjBitString + "1";
		}
		return adjBitString;
	}


	/**
	 * 
	 * @param length
	 * @return
	 */
	private static List<String> getAllBitCombos(int length) {
		allBitCombos.clear();
		getStrings( "", length ); // initial call
		return allBitCombos;
	}


	/**
	 * 
	 * @param s String
	 * @param digitsLeft
	 */
	static void getStrings( String s, int digitsLeft )
	{
		if( digitsLeft == 0 ) // the length of string is n
			allBitCombos.add(s);
		else
		{
			getStrings( s + "0", digitsLeft - 1 );
			getStrings( s + "1", digitsLeft - 1 );
		}
	}



}
