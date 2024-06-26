package Prac;

public class RevStr {
	public static String rev(String s) {
		String r="";
		for(int i=0;i<s.length();i++) {
			r=s.charAt(i)+r;                  //A+"", l+A, i+lA, v+ilA, a+vilA, M+avilA
		}
		return r;
	}
	
	public static String rev1(String st) {
		String r="";
		for(int i=st.length()-1;i>=0;i--) {
			r=r+st.charAt(i);
			//System.out.println(r);
		}
		return r;
	}

	public static void main(String[] args) {
		String str="AlivaM";
		System.out.println("before: "+str);
		System.out.println("After: "+rev(str));
		System.out.println("with old method: "+rev1(str));

	}

}
