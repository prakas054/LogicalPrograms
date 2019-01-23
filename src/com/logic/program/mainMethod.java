package com.logic.program;

class SupperExample {
	
	String s= "Rimmy";
	
	public void SupperMethod() {
		
		System.out.println("The SupperClass variable is " +s);
		System.out.println("I am in parrent class");
		System.out.println("---------------------------------------------");
		
	}
}
     class SubClass extends SupperExample {
     	
	public void SubMetod() {
		
		String S="Simmy"; 
		System.out.println("I am in Child Class");	
		System.out.println("The Sub class variable is " +S);
		System.out.println("-------------------------------------------");
		
		super.SupperMethod();
		System.out.println("The Supper Class variable is " +super.s);
	}
	
}	

      class mainMethod {
	public static void main(String[] args) {
		
		SubClass Sb = new SubClass();
		Sb.SubMetod();
		System.out.println("**************************************************************");
		Sb.SupperMethod();
		
		SupperExample Se =new SubClass();
		Se.SupperMethod();		
	}
}