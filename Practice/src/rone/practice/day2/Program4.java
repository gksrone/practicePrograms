package rone.practice.day2;

import java.util.ArrayList;
import java.util.List;

public class Program4 {
	public List<Integer> getPrimeNumbers(int from, int to) {
        /*
          Please implement this method to
          return a list of all prime numbers in the given range (inclusively).
          A prime number is a natural number that has exactly two distinct natural number divisors, which are 1 and the prime number itself.
          The first prime numbers are: 2, 3, 5, 7, 11, 13
         */
		List<Integer> primeNumbers = new ArrayList<Integer>();
		boolean isPrime =  true;
		for(int k = from; k <= to; k++) {
			int i = k / 2;
			while(isPrime && i > 1) {
				if ( k % i != 0) {
					i--;
					continue;
				}
				else {
					isPrime = false;
				}
			}
			if(isPrime) {
				primeNumbers.add(k);
				}
			isPrime = true;
			}
		
		return primeNumbers;
    }
}
