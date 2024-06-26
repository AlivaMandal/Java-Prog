package Prac;

public class DtoB {
	static long dectoBin(int n) {
		if(n==0)
			return 0;
		return ((n%2) + 10*dectoBin(n/2));
	}

	public static void main(String[] args) {
		int n=7;
		System.out.print("binary of "+n+" is "+dectoBin(n));

	}

}
