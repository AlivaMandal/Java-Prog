package com.Acc.prv;
import java.util.HashSet;

public class AutobioCountDist {
	public static boolean autobio(String ab) {
		for (int i = 0; i < ab.length(); i++) {
          int index =ab.charAt(i)-'0';
          System.out.println(ab.charAt(i));
          System.out.println("indexvalue: "+index);
           int cnt=0;
     
            for (int j = 0; j < ab.length(); j++) {
                int number = ab.charAt(j)-'0';
                System.out.println("number: "+number);
                if (number == i) {
                    cnt++;
                }
            }
            System.out.println("count: "+cnt);
            System.out.println("matching for "+i+"th digit: "+(cnt!=index ? false:true));
            if (cnt != index) {
                return false;
            }
        }
        return true;
	}

	public static int count(String n) {
		if(n==null)
			return 0;
		
		HashSet<Integer> uniq=new HashSet<>();     //it stores only unique digit in number
		int t=Integer.parseInt(n);
		while(t>0) {
			int r=t%10;
			uniq.add(r);
			t/=10;
		}
		if(autobio(n))
			return uniq.size();
		else
			return 0;
	}
	
	public static void main(String[] args) {
		String n="124512";
		String s="1210";
		//System.out.println("Autobiographical Number and district count:"+count(n));
		//System.out.println("Autobiographical Number and district count:"+count(s));
		System.out.println("true/false: "+autobio(n));
		System.out.println("uniq count: "+count(s));
	}

}
