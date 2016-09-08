package greencoffeemaker.main;

import java.util.ResourceBundle;

import org.apache.log4j.Logger;

import greencoffeemaker.sub.SubClass;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Maven Building World !");
		System.out.println(new SubClass().hello());

		// Property file must be in the class path.
		// For example, src/main/resources
		ResourceBundle bundle = ResourceBundle.getBundle("myresource");
		System.out.println(bundle.getString("hello.world"));

		// For example, the same directory as the JAR file.
		ResourceBundle bundle2 = ResourceBundle.getBundle("myexternal");
		System.out.println(bundle2.getString("hello.world"));


		Logger logger = Logger.getLogger("mylogger");
		logger.trace("This is TRACE level message.");
		logger.debug("This is DEBUG level message.");
		logger.info("This is INFOMATION level message.");
		logger.warn("This is WARNNING level message.");
		logger.error("This is ERROR level message.");
		logger.fatal("This is FATAL level message.");


	}

}
