/**
 * 
 */
package rone.practice.may17th2015;

/**
 * @author Ronnie
 *
 */
public class WrapperClass {

	/**
	 * enums for days of a week.
	 * @author Ronnie
	 *
	 */
	public enum Day{MON, TUE, WED, THU, FRI, SAT, SUN};
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean booleanVar = null;
		Character charVar;
		Integer intVar = 50;
		Byte byteVar = (byte)34000;
		Short shortVar = (short)100;
		Long longVar;
		Float floatVar;
		Double doubleVar;
		Integer number = new Integer("-2333");
		
		booleanVar = Boolean.TRUE;
		System.out.println(shortVar.shortValue());
		System.out.println(byteVar.byteValue());
		System.out.println(intVar.intValue() +" otherwise "+ intVar);
		System.out.println(number);

		Day date;
		date = Day.SUN;
		System.out.println(date +"at position"+date.ordinal() + date.getDeclaringClass());
		
		
	}

}
