package greencoffeemaker.main;

import java.util.ResourceBundle;

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
	}

}
