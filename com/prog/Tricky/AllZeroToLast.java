package com.prog.Tricky;

public class AllZeroToLast {
	static int[] zerolast(int a[]) {
		int j=0,i;
		for(i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[j]=a[i];
				j++;
			}
		}
			for(int k=j;k<a.length;k++) {
				a[k]=0;
		}
		return a;
	}

	public static void main(String[] args) {
		int arr[]= {2,0,8,6,0,3,4,0};
		int modi[]=zerolast(arr);
		int n=arr.length;
		System.out.println("length: "+n);
		for(int t=0;t<n;t++) {
		System.out.print(modi[t]+" ");
		}
	}

}
