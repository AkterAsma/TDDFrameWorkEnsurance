package utils;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.testng.Reporter;

public class Loggers {
	
  private static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
	
	public static void getLog(String msg) {
		logger.log(Level.INFO, msg);//java console log
		Reporter.log(msg + "<br>");//testing reporter log
		
	}

}