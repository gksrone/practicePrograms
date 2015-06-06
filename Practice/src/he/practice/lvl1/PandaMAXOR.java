/**
 * 
 */
package he.practice.lvl1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Ronnie
 *
 */
public class PandaMAXOR {

    private static int MOD = 1000000007;
    private static int index = 0;
    private static long[] array = new long[128];
    private static String COMMA = ",";

    /**
     * the method is implemented using recursion.
     */
    public static void main(String[] args) {
        int lengthOfArray = 0;
        Scanner input = new Scanner(System.in);
        if(input.hasNextLine()) {
            try{
                lengthOfArray = Integer.parseInt(input.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("length of array not valid");
            }
        }

        List<Integer> numbers = new ArrayList<Integer>();
        //Set<Integer> numEntered = new HashSet<Integer>();
        for(int i = 0; i <lengthOfArray; i++) {
            try {
                if(input.hasNextLine()) {
                    numbers.add(input.nextInt() % MOD);
                }
            } catch(Exception e) {
                System.out.println("not a valid number");
            }
        }  
        //List<Integer> numbers = new ArrayList<Integer>(numEntered);    
        final List<List<String>> allSubsets = powerSet(numbers, index);

        /*for (List<String> subsets : allSubsets) {
            System.out.println(subsets);
        }*/

        for (final List<String> subsets : allSubsets) {
            String getNumInList = subsets.get(index);
            String[] numArray = getNumInList.split(COMMA);
            List<String> numList = Arrays.asList(numArray);
            getMaxOr(numList);
        }        
        printMAXOR();
        input.close();
    }

    private static void printMAXOR() {
        long ans=0;
        for (int i = 0; i < array.length; i++) {
            ans=ans+(array[i]*(array[i]-1))/2;
        }
        System.out.println(ans);
    }

    private static void getMaxOr(List<String> numList) {
        int value = 0;
        for(String num : numList) {
            value = (value ^ Integer.parseInt(num));
        }
        /*if (XORMAP.containsKey(value % 127)) {
            XORMAP.put(value % 127, XORMAP.get(value % 127)+1);
            counter++;
        } else {
            XORMAP.put(value % 127, 1); 
        }*/
        //System.out.println(value);
        array[value]++;
    }

    private static List<List<String>> powerSet(final List<Integer> values,
            int index) {
        if (index == values.size()) {
            return new ArrayList<>();
        }
        int val = values.get(index);
        List<List<String>> subset = powerSet(values, index + 1);
        List<List<String>> returnList = new ArrayList<>();
        returnList.add(Arrays.asList(String.valueOf(val)));
        returnList.addAll(subset);
        for (final List<String> subsetValues : subset) {
            for (final String subsetValue : subsetValues) {
                returnList.add(Arrays.asList(val + "," + subsetValue));
            }
        }
        return returnList;
    }
}
