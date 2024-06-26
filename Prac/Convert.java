package Prac;

public class Convert {
	static int m1(char c) {
		int n=c-'0';       //(asci value of c)-ascii value of '0'(48)
		return n;
	}

	public static void main(String[] args) {
		char c='9';                                //ascii values of (0-9) -> (48-57)
		System.out.println(c+1);                //ascii value of c + 1
		System.out.println(m1(c));
		System.out.println(m1(c)+1);
	}

}
