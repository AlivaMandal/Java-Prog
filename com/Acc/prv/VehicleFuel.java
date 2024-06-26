package com.Acc.prv;

import java.util.Arrays;

public class VehicleFuel {
	public static int refuelStop(int dist,int num,int cap[]) {
		int min = 0,current = 0;
		Arrays.sort(cap);
		for(int i=num-1;i>=0;i--) {
			current = current + cap[i]; 
			//System.out.println("remaining add: "+current); //0+120, 20+90=110,  10+80=90,   
			if(current<dist) {             //90<100
				min++;                      //count of Refuel times
				current = current + dist;
				current = current - dist;
				//System.out.println("after refuel and subtract dist:"+current);  
				                        
			}else {
			current = current - dist;
			//System.out.println("beche galo:"+current);  //120-100=20,  110-100=10,    170-
			}
		}
		//System.out.println(min);
		return min;
		
	}

	public static void main(String[] args) {
		int dist=100,num=4;
		int cap[]= {80,120,90,70};          //70,80,90,120
		int dist1=120,num1=6;
		int cap1[]= {90,120,110,105,80,70};     //70,80,90,105,110,120
		System.out.println("count of refuel in input1: "+refuelStop(dist,num,cap));
		System.out.println("count of refuel in input2: "+refuelStop(dist1,num1,cap1));
		
	}

}
