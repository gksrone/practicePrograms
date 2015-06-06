package rone.practice.programs;

import java.util.HashSet;
import java.util.Set;

public class program {
	 public static Set<Object> getUniqueElements(Set<Object> a, Set<Object> b) {
		
	        /*
	          Please implement this method to
	          return a set of elements that can be found only in set a or set b,
	          but not in both Sets.
	          The method should not change the content of the parameters.
	         */
		Set<Object> values = new HashSet<Object>();
		 
		for(Object checkSetOne : a){
			for(Object checkSetTwo : b){
				if(checkSetOne.equals(checkSetTwo)){
					values.add(checkSetOne);
				}
			}
		}
		
		return values;
	    }
}
