package Prac;

public class RevNum {
	public static int palin(int n) {
		int rev= 0;
		while(n != 0) {
			rev = rev*10 + (n%10);
			n /=n;
		}
		return rev;
	}

	public static void main(String[] args) {
		int n=512;
		System.out.println(palin(n));
	}

}
