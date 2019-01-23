package com.logic.program;

public class MethodOverloading {
	
	void method(int x) {
		System.out.println("It is in First Method ");
		System.out.println("The argument is " +x );
		System.out.println("---------------------------------------");
	}
	
	void method(String s) {
		
		System.out.println("it is in Second method ");
		System.out.println("The argument is " +s);
		System.out.println("---------------------------------------");
	}
	
     void method(Double d) {
		
		System.out.println("it is in Third method ");
		System.out.println("The argument is " +d);
		System.out.println("---------------------------------------");
	}
     
     void method(Double a, int b) {
 		
 		System.out.println("it is in Forth method ");
 		System.out.println("The arguments are " +a +" and " +b );
 		System.out.println("---------------------------------------");
 	}

    public static void main(String[] args) {
		
    	MethodOverloading M = new MethodOverloading();
    	M.method(5);
    	M.method(6.2);
    	M.method("I am very bad boy");
    	M.method(3.2, 8);
    	main(10);   	
	}
    
    public static void main(int x) {
    	
    	System.out.println("I am in second main");
		
	}
       
}
