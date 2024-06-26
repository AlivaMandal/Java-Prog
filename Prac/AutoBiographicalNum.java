package Prac;

public class AutoBiographicalNum {
	public static boolean check(int input) {
		int num=Math.abs(input);
		int temp= num;
		String s= String.valueOf(num);
		int arr[]= new int[s.length()];
		for(int i=arr.length-1;i>=0;i--) {  //to store each element of input inside array
			arr[i] = temp%10;
			temp=temp/10;
		}
		
		boolean f=true;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j])
					count++;
			}
			System.out.println(arr[i]);
			if(arr[i]!=count)
				f=false;
			    break;
		}
		if(f)
			return true;
		else
		    return false;
	}
    public static int findAutoCount (String n) 
    {
        int sum = 0;
        for (int i = 0; i < n.length (); i++) {
            sum = sum + Integer.parseInt (n.charAt (i) + "");
            System.out.println(Integer.parseInt (n.charAt (i) + ""));
        }        
        if (sum == n.length ())
        {
            int count = 0;
            int arr[] = new int[n.length()];
            for (int i = 0; i < n.length (); i++) {
                arr[Integer.parseInt (n.charAt (i) + "")]++;
                //System.out.print(arr);
            }
            for (int i = 0; i < arr.length; i++)
                if (arr[i] != 0)
                    count++;
            return count;
        }
        else
            return 0;
    }


	public static void main(String[] args) {
		//String s="1210";
		int n=1210;
		//System.out.println(findAutoCount(s));
		System.out.println(check(n));

	}

}
