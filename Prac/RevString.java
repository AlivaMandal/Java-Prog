package Prac;

public class RevString {
	public static String rev(String s) {
		return new StringBuilder(s).reverse().toString();
	}

	public static void main(String[] args) {
		String str ="AlivaMandal";
		System.out.println("reverse string: "+rev(str));
	}

}
