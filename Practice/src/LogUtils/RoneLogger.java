/**
 * 
 */
package LogUtils;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Ronnie
 *
 */
public class RoneLogger{

	/**
	 * get logger object for logging.
	 */
	Logger log = Logger.getGlobal();
	
	RoneLogger logger = new RoneLogger();
	
	public RoneLogger getInstance(){		
		return logger;
	}

}
