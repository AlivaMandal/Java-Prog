package com.Acc.prv;

import java.util.ArrayList;
import java.util.Collections;

public class SndLargOfevOdIdx {
	public static int sum(int a[]) {
		int sum=0;
		ArrayList < Integer > even = new ArrayList < Integer > ();
        ArrayList < Integer > odd = new ArrayList < Integer > ();
        even.add (a[0]);

        for (int i = 1; i < a.length; i++)
        {
            if (i % 2 == 0)
                even.add (a[i]);
            else
                odd.add (a[i]);
        }
        Collections.sort (even);
        Collections.sort (odd);
        int n1=even.get(even.size () - 2);
        int n2=odd.get(odd.size()-2);
        sum=n1+n2;
		return sum;
	}

	public static void main(String[] args) {
		int a2[]= {3,4,1,7,9};
		System.out.println("sum of 2nd large from even and odd indexed number: "+sum(a2));
	}

}
