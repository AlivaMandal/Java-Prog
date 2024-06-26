package com.Distribution;

public class CakeDis {
	static int dis(int n,int m) {
		int sum= n*(n+1)/2;
		System.out.println("sum of cake which will be distributes: "+sum);
		int q=m/sum;
		System.out.println("res="+q);
		int rem=m%sum;
		double ans= m - (q*sum);
		System.out.println("left cake after 1st round= "+ans);
		double x = (-1+ Math.pow((8 * rem)+1,0.5))/2;
		System.out.println("2nd round cake to be distributed "+x);
		double sum1=x*(x+1)/2;
		System.out.println("sum of student for 2nd round: "+sum1);
		ans= ans - sum1;
		
		return (int) ans;
	}

	public static void main(String[] args) {
	int n=5;
	int m=37;
	int ans=dis(n,m);
	System.out.println("left cake= "+ans);

	}

}
