package com.prog.Tricky;

public class Autobio {
	public static boolean auto(String input) {
	
		for(int i=0;i<input.length();i++) {
		int idx=Integer.parseInt(input.charAt(i)+"");
			int count=0;
			for(int j=0;j<input.length();j++) {
			int number=Integer.parseInt(input.charAt(j)+"");
			if(number==i)
				count++;
			}
			if(count!=idx)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String a="1210";
		System.out.println("autobiographical number? -> "+auto(a));

	}

}
