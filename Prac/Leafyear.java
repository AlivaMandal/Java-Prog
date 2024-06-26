package Prac;

public class Leafyear {
	static boolean checkLeaf(int year) {
		if(year%400 ==0 || (year%100 !=0 && year%4==0))
			return true;
		return false;
	}

	public static void main(String[] args) {
		int y=2004;
		System.out.println("this is leaf year: "+checkLeaf(y));
	}

}
