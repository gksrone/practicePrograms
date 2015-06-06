package rone.practice.day2;

/**
 * 
 * @author Ronnie
 *
 */

public class Program {

	public int[] retainPositiveNumbers(int[] a) {
		/*
	          Please implement this method to
	          return a new array with only positive numbers from the given array.
	          The elements in the resulting array shall be sorted in the ascending order.
		 */
		int j = 0;

		// for fetching the number of positive numbers
		// this is for calculating the size of the array that is to be sorted
		for(int i : a){
			if(i >= 0)
				j++;
		}

		int[] b = new int[j];
		for(int i : a){
			if(i >= 0){
				b[--j]=i;
			}
		}

		// for ascending order
		for(int k = 0; k < b.length ; k++){
			for(int l = k+1; l<b.length ; l++){
				if(b[k] > b[l]){
					int temp = 0;
					temp = b[l];
					b[l] = b[k];
					b[k] = temp;
				}
			}
		}
		return b;
	}


}
