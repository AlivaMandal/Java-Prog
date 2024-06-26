package com.Acc.prv;

public class EquibriliumPoint {
	public static int equibrilim(int a[]) {  //some of right element = sum of left element
		int lSum,rSum,i,l,r;                 // will be equal at a point and return that index
		for(i=0;i<a.length;i++) {
			lSum=0;
		    for(l=0;l<i;l++) {
		   	    lSum+=a[l];
		    }
		    rSum=0;
		    for(r=i+1;r<a.length;r++) {
		    	rSum+=a[r];
		    }
		    if(lSum == rSum) {
		    	return i+1;
		    }
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int ar[]= {-7,2,4,9,-8,1,6};        //left= (-7+2+4)=-1 and right=(6+1-8)=-1
		System.out.println("equibrilium point: "+equibrilim(ar));
		                                    //leftSum==rightSum at 9(index=4)
	}

}
