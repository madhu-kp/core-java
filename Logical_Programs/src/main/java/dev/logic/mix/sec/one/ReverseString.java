package dev.logic.mix.sec.one;

/**
 * Reverse String without using reverse API
 * 
 * @author gauraw
 *
 */
public class ReverseString {

	public static void main(String[] args) {

		String str = "Hello world";
		String revstring = "";

		for (int i = str.length() - 1; i >= 0; --i) {
			revstring += str.charAt(i);
		}

		System.out.println(revstring);
	}
}
