package com.prog.Tricky;

public class NegPos {
	static int[] negtopos(int a[]) {
		for(int i=1;i<a.length;i++) {
			int current=a[i];
			if(current>0)
				continue;     //except the +ve elements
			int j=i-1;
			while(j>=0 && a[j]>0) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=current;
		}
		return a;
	}

	static int[] method2(int ar[]) {
		int e=0,j=0;
		for(int i=1;i<ar.length;i++) {
			if(ar[i]<0) {
				e=ar[i];
                System.out.print("cur: "+ar[i]+" "+i+" position");
                System.out.println();
			for(int k=i;k>j;k--) {
				System.out.print("Pos: "+ar[k]+" "+k+" position");
				System.out.println();
				ar[k] = ar[k-1];
			}
			ar[j]= e;
			j++;
		}
		
		}
		return ar;
	}
	public static void main(String[] args) {
		int a[]= {1,-2,5,2,-7,4,-1,3};
		int ans[]=method2(a);
		for(int i=0;i<a.length;i++) {
			System.out.print(ans[i]+" ");
		}

	}

}
