package com.logic.program;

import java.util.Scanner;

public class EvenNo {

	public static void main(String[] args) {
		int n;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the limit ");
		n = S.nextInt();
		
		System.out.println("Even numbers are: ");
		
		for(int i = 1; i <= n-1 ; i++) {
			if(i%2==0)
				System.out.print(i+ "" +",");
		 }
		
		if(n%2==0)
			System.out.println(n +".");
		else
			System.out.println(".");
		S.close();
  }
}
