/**
 * 
 */
package he.practice.problems;

import java.util.Scanner;

/**
 * @author Ronnie
 *
 */
public class FuzzBuzz {

    private static int NUM_THREE = 3;
    private static int NUM_FIVE = 5;

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

        if(input.hasNextLine()) {
            String inputNumbers = input.nextLine();
            String[] numbersInString = inputNumbers.split(" ");
            if (numbersInString.length == numOfTestCases) {
                int number = 0;
                for (int i = 0; i < numbersInString.length; i++) {
                    try {
                        number = Integer.parseInt(numbersInString[i]);
                        fuzzbuzz(number);
                    } catch (Exception e) {
                        System.out.println("not valid number = "
                                + numbersInString[i]);
                    }
                }
            } else {
                System.out.println("not valid number of test cases");
            }
        }
        input.close();
    }

    private static void fuzzbuzz(int number) {
        if(number == 0) {
            System.out.println(number);
            return;
        }
        int counter = 1;
        while(counter <= number) {
            checkConditions(counter);
            counter++;
        }
    }

    private static void checkConditions(int counter) {
        if((counter % NUM_FIVE) == 0 && (counter % NUM_THREE) == 0){
            System.out.println("FizzBuzz");
        } else if ((counter % NUM_THREE) == 0) {
            System.out.println("Fizz");
        } else if ((counter % NUM_FIVE) == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(counter);
        }        
    }

}
