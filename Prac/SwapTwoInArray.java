package Prac;

public class SwapTwoInArray {
	static void swap(int a[],int i,int j) {
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
		System.out.println("after swapping: ");
		for(int x=0;x<a.length;x++) {
			System.out.print(a[x]+" ");
		}
	}

	public static void main(String[] args) {
		int a[]= {1,5,6,41,2,3,7,9};
		System.out.println("Before swapping: ");
		for(int x=0;x<a.length;x++) {
			System.out.print(a[x]+" ");
		}
		System.out.println();
		System.out.println("size of the array: "+a.length);
		swap(a,5,4);
		
	}

}
