package Prac;

public class PrimeCheck {
	static boolean check(int a) {
		if(a == 1 || a ==0)
			return false;
		if(a== 2)
			return true;
		for(int i=2;i<a/2;i++) {
			if(a%i == 0) 
				return false;
		}
		
		/* 
		 * for(int i=2;i*i<a;i++){
		 * if(a%i ==0)
		 * return false;
		 *  */
		
		return true;
	}

	public static void main(String[] args) {
		int n= 15;
		System.out.println("checking: "+check(n));

	}

}
