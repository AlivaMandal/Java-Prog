package com.OOP.pack.inheritance;
class Grand{
	int n;
	Grand(){
		
	}
	void method1() {
		System.out.println("Hi");
	}
}
class Parent extends Grand{
	int x=5;
	void method1() {
		System.out.println("hellooooo");
	}
}
class Child extends Parent{
	
}

public class Multiple {
	

	public static void main(String[] args) {
		Grand c = new Parent();
		c.method1();
		
		
	}

}
