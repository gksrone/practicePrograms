/**
 * 
 */
package he.practice.problems;

import java.util.Scanner;

/**
 * @author Ronnie
 *
 */
public class SumOfNumbers {

    /**
     * @param args
     */
    public static void main(String[] args) {
        int numOfTestCases = 0;
        Scanner input = new Scanner(System.in);
        if(input.hasNextLine()) {
            try{
                numOfTestCases = Integer.parseInt(input.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("number format exception in no. of test cases");
            }
        }

        while(numOfTestCases != 0){
            if(input.hasNextLine()) {
                String inputNumbers = input.nextLine();
                if(inputNumbers.isEmpty()){
                    System.out.println("no number enetered");
                } else {
                    getSumOfNum(inputNumbers);
                }
            }
            numOfTestCases--;
        }
        input.close();
    }

    /**
     * @param inputNumbers
     */
    private static void getSumOfNum(String inputNumbers) {
        String[] numbersInString = inputNumbers.split(" ");
        int sum = 0;
        for( int i = 0; i < numbersInString.length; i++) {
            try {
                sum = sum +Integer.parseInt(numbersInString[i]);
            } catch(Exception e) {
                System.out.println("not a valid number " + numbersInString[i]);
                break;
            }
        }
        System.out.println(sum);
    }

}
