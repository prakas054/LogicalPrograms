package com.logic.program;

import java.util.Scanner;
public class RevString02 {
  public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in); 
	  System.out.println("enter the string"); 
	  String st=sc.nextLine(); char ch[]=st.toCharArray(); 
	  for (int i=0 ;i<ch.length/2;i++ ) {
		  char t=ch[i]; 
		  ch[i]=ch[ch.length-1-i];
		  ch[ch.length-1-i]=t; 
		  }
	  st=new String (ch);
	  
	  System.out.println("Reserved string is :"+st); 
	sc.close();
  }
}

