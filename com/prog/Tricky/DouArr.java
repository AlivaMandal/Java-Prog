package com.prog.Tricky;

public class DouArr {
	public static int check(int[][] a) {
		int x=0;
		int y=0;
		
		for(int[] i : a) {
			int sal=i[0];
			int roll=i[1];
			//int id=i[2];
			//int deg=i[3];
			
			if(sal>500) {
				x +=roll;
			}else if(sal<500) {
				y -=roll;
			}else if(sal>500 && roll>5){
				x +=roll;
			}else {
				y +=roll;
			}
		}
		return x+y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{512,4},{842,6},{200,6},{145,2}};
		int ans = check(arr);
		System.out.println("answer is "+ans);
		

	}

}
