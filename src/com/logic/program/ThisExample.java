package com.logic.program;

public class ThisExample {
	
	int a;
	String s;
	String S= "ram";
	
	public void methodBody(int a, String s){
		this.a=a;
		this.s=s;		
		System.out.println("I am in Method Body");
		System.out.println("the value of variable is " +a +" and " +s );
		System.out.println("the Deceleared instance variablre is " +this.S);
		System.out.println("-----------------------------------------------------");
	}
	
	public void use() {
		
		System.out.println("the value of variable is " +a +" and " +s );
	}

	public static void main(String[] args) {
		
		ThisExample Obj = new ThisExample();
		Obj.methodBody(5, "Shita");
		Obj.use();

	}

}
