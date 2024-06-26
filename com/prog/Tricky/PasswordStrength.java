package com.prog.Tricky;

import java.util.Scanner;

public class PasswordStrength {
	static boolean strength(String pas) {
	int lower=0,upper=0,dig=0,sym=0;
	for(int i=0;i<pas.length();i++) {
		if(Character.isLowerCase(pas.charAt(i)))
			lower++;
		if(Character.isUpperCase(pas.charAt(i)))
			upper++;
		if(Character.isDigit(pas.charAt(i)))
			dig++;
		if(!Character.isDigit(pas.charAt(i))
                && !Character.isLetter(pas.charAt(i))
                && !Character.isWhitespace(pas.charAt(i)))
			sym++;
	}
	if(pas.length()>=8 && lower!=0 && upper!=0 && dig!=0 && sym!=0) {
		return true;
	}else {
		return false;
	}
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter your password: ");
		String password=s.nextLine();
		System.out.println(strength(password));
		s.close();
	}

}
