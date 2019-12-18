package com.selenium.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j {
	
	static final Logger logger = Logger.getLogger(Log4j.class);

	public static void main(String[] args) {
		PropertyConfigurator.configure(System.getProperty("user.dir")+"\\src\\com\\selenium\\log4j\\log4j.properties");
		
		
		logger.debug("Sample debug message");
		logger.info("Sample info message roopa");
		logger.warn("Sample warn message");
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		
	}

}
