package StaticImport;

import java.io.PrintStream;

public class StringManinpulation {

	static String firstName = "Simon";

	public static void main(String[] args) {
		System.out.println(firstName);

		PrintStream printStream = new PrintStream(System.out);
		printStream.println("!!");
		
	}
}
