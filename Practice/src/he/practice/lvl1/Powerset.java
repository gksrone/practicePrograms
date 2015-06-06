package he.practice.lvl1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Powerset{
    private static int MOD = 1000000007;
    private static List<Integer> numbers = new ArrayList<Integer>();
    private static long[] array = new long[128];


    public static void main(String []args){
        int lengthOfArray = 0;
        Scanner input = new Scanner(System.in);
        if(input.hasNextLine()) {
            try{
                lengthOfArray = Integer.parseInt(input.nextLine());
            } catch(NumberFormatException e) {
                System.out.println("length of array not valid");
            }
        }
        
        // Enter numbers in the list
        for(int i = 0; i <lengthOfArray; i++) {
            try {
                if(input.hasNextLine()) {
                    numbers.add(input.nextInt() % MOD);
                }
            } catch(Exception e) {
                System.out.println("not a valid number");
            }
        }
            
        for(int index = 0; index < numbers.size(); index++){ //traverse through all characters
            subs(0,index);
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

    static void subs(int substr, int index)
    {
        substr = substr ^ numbers.get(index); 
        array[substr]++;

        for(int i = index+1; i < numbers.size(); i++)
            subs(substr, i); //call recursively

    }
}