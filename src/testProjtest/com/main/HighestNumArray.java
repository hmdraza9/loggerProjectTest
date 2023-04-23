package testProjtest.com.main;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HighestNumArray {
	
	private static final Logger logger = LogManager.getLogger(HighestNumArray.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numArray = { 5, 2, 9, 24, 11, 19, 20 };
		int max = numArray[0];

		for (int i = 0; i < numArray.length; i++) {

			if (max < numArray[i]) {

				max = numArray[i];

			}

		}
//		System.out.println(max);

//		hellyeah();
		loggerMe();

	}
	
	public static void loggerMe() {

		logger.error("error: First logger statement");
		logger.debug("debug: First logger statement");
		logger.fatal("fatal: First logger statement");
		logger.info("info: First logger statement");
		logger.warn("warn: First logger statement");
	}

	public static void hellyeah() {

		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");

		if (s1.equals(s3)) {
			System.out.println("s1 equals s3");
		}
		if (s1 == s2) {
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 !== s2");
		}
		if (s3 == s4) {
			System.out.println("s3 == s4");
		} else {
			System.out.println("s3 !== s4");
		}
		if (s1 == s3) {
			System.out.println("s1 == s3");
		} else {
			System.out.println("s1 !== s3");
		}

	}

}
