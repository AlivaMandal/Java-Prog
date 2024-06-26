package Prac;

public class VowelRev {
	public static String vowel(String s) {
		return s.replaceAll("[AEIOUaeiou]", "");
	}

	public static void main(String[] args) {
		String str = "Kolkata is greatest city in India";
		System.out.println("After removed vowels in string: "+vowel(str));

	}

}
