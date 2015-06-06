package rone.practice.day2;

public class Program2 {
	public String capitalizeFirstLetters(String s) {

		/*
          Please implement this method to
          capitalize all first letters of the words in the given String.
          All other symbols shall remain intact. If a word starts not with a letter, it shall remain intact too.
          Assume that the parameter String can only contain spaces and alphanumeric characters.

          NOTE: please keep in mind that the words can be divided by single or multiple spaces.
          The spaced also can be found at the beginning or the end of the parameter string,
          and you need to preserve them.
		 */
		String[] subString = s.split(" ");
		char[] sur = null;
		s = "";
		for(String sub : subString) {

			if (sub.equalsIgnoreCase("")) {
				s = s+sub+" ";
				continue;
			}
			if(!sub.startsWith("\\d+")) {
				sur = sub.toCharArray();
				sub = ""; 
				//				int num = (int)sur[0];
				//				System.out.println(num);
				
				if( (int)sur[0] >= 97 && (int)sur[0] <= 123) {
					//					System.out.println(sur[0]);
					int a = sur[0] - 32 ;
					sur[0] = (char) a;
					//					System.out.println(sur[0]);
				}
				
				for(char c: sur){
					sub=sub + c;
				}
				//				System.out.println(sub);
				sur=null;
				s = s+sub+" ";
			}
		}
		return s;
	}
}
