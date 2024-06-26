package Prac;

public class BtoD {
	static int bintodec(int n) {
		int base=1,dec=0,rem;
		while(n>0) {
			rem=n%10;
			dec=dec+(base*rem);
			n=n/10;
			base=base*2;
		}
		return dec;
	}
	
	static int method2(int b) {
		int d=0,power=0;
		while(b>0) {
			if(b%10 == 1) {
			d=d+(1<<power);  
			}
			power++;
			b=b/10;
		}
		return d;
	}

	public static void main(String[] args) {
		int n=111;
		System.out.println("binary "+n+" to decimal: "+bintodec(n) );
		int n1=101;
		System.out.println("binary "+n1+" to decimal: "+method2(n) );
	}

}
