package test.logger.classes;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLogger {

	private static final Logger logger = LogManager.getLogger(TestLogger.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		logger.error("error: First logger statement");
		logger.debug("debug: First logger statement");
		logger.fatal("fatal: First logger statement");
		logger.info("info: First logger statement");
		logger.warn("warn: First logger statement");
	}

}
