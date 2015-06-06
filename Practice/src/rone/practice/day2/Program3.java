package rone.practice.day2;

public class Program3 {
	public int countWords(String s) {
        /*
          Please implement this method to
          return the word count in a given String.
          Assume that the parameter String can only contain spaces and alphanumeric characters.
         */
		int num = 0;
		
		String[] subString = s.split(" ");
		
		for(String str : subString) {
			if(str.matches("\\w*")) {
				num++;
			}
		}
		
		return num;
    }
}
