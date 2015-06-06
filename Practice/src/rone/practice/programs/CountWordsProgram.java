package rone.practice.programs;

public class CountWordsProgram {
	
	 public  int countWords(String s) {
	        /*
	          Please implement this method to
	          return the word count in a given String.
	          Assume that the parameter String can only contain spaces and alphanumeric characters.
	         */
		 
		 String[] number = s.split(" ");
		 return number.length;
	    }
}
