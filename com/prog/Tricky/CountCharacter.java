package com.prog.Tricky;

public class CountCharacter {
	static int count(int n) {
		int con=0;
		while(n!=0) {
			con++;
			n=n/10;
		}
		return con;
	}
	
	static int countStr(String s) {
		int con=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') 
				con++;
		}
		return con;
	}

	public static void main(String[] args) {
		int num=123456;
		String s="aliva";
		System.out.println("counted character present in number= "+count(num));
		System.out.println("character present in string "+s+" is "+countStr(s));

	}

}
