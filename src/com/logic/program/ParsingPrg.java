package com.logic.program;

public class ParsingPrg {

	public static void main(String[] args) {
		String s1 = "90";
		String s2 = "60";
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		System.out.println(i+" + "+j+" = "+i+j);
		
		int sum= i+j;
		System.out.println("Sum = " + sum);	
	}

}
