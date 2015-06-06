/**
 * 
 */
package rone.helper.utils;

/**
 * @author Ronnie
 *
 */
public class HelperUtils {

	/**
	 * get the runtime status.
	 */
	public void getRuntimeStatus(){
	// Get the Java runtime
    Runtime runtime = Runtime.getRuntime();
    // Run the garbage collector
    runtime.gc();
    // Calculate the used memory
    long memory = runtime.totalMemory() - runtime.freeMemory();
    System.out.println("Used memory is bytes: " + memory);
    System.out.println("Used memory is megabytes: "
        + bytesToMegabytes(memory));
	}

	
	/**
	 * returns memory in megabytes
	 * @param memory long
	 * @return memory in megabytes
	 */
	private long bytesToMegabytes(long memory) {
		return memory / 1024;
	}
}
