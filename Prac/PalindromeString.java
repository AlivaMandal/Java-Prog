package Prac;

public class PalindromeString {
	public static boolean checkPalin(String s) {
		String rev = new StringBuilder(s).reverse().toString();
		return s.equals(rev);
	}

	public static void main(String[] args) {
		String str ="daenyrs";
		System.out.println("Palindrome string: "+checkPalin(str));
	}

}
