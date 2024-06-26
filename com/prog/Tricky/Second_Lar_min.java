package com.prog.Tricky;

import java.util.ArrayList;
import java.util.Collections;

/* 
 * sum 2nd largest number even position and 2nd minimum number at odd position  */

public class Second_Lar_min {
	static int sum(int[] arr) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				max = Math.max(max, arr[i]);
			}else {
				min = Math.min(min, arr[i]);
			}
	
		}
		int Slar=Integer.MIN_VALUE;
		int Smin=Integer.MAX_VALUE;
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=max && arr[j]!=min) {
				if(j%2 ==0) {
					Slar = Math.max(Slar, arr[j]);
				}else {
					Smin = Math.min(Smin, arr[j]);
				}
			}
		}
		sum=Slar+Smin;
		System.out.println("maximum="+max);
		System.out.println("2nd maximum="+Slar);
		System.out.println("minimum="+min);
		System.out.println("2nd minimum="+Smin);
		
		
		return sum;
	}
	static int sum2(int arr[]) {
		ArrayList < Integer > even = new ArrayList < Integer > ();
        ArrayList < Integer > odd = new ArrayList < Integer > ();
        even.add (arr[0]);

        for (int i = 1; i < arr.length; i++)
        {
            if (i % 2 == 0)
                even.add (arr[i]);
            else
                odd.add (arr[i]);
        }
        Collections.sort (even);
        Collections.sort (odd);
        int n1=even.get(even.size () - 2);
        int n2=odd.get(odd.size()-2);
        return  n1+n2;                         //sum of 2nd largest numbers from both 
	}                                          //even and odd indexed sub-arrays 

	public static void main(String[] args) {
		int arr[]= {3, 2, 1, 7, 5, 4};
		int a2[]= {3,4,1,7,9};
		System.out.println("sum of 2nd large and 2nd minn: "+sum(arr));
		System.out.println("sum of 2nd large from even and odd indexed number: "+sum2(a2));

	}

}
