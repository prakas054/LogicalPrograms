package com.logic.program;
import java.io.*;

public class Ideone {

	public static void main(String[] args) throws java.lang.Exception
 {
		BufferedReader r = new BufferedReader (new InputStreamReader (System.in));

	//	String s;
    //  while (!(s=r.readLine()).startsWith("42")) System.out.println(s);
 
        int a = Integer.parseInt(r.readLine());	
        int b = Integer.parseInt(r.readLine());
		
        System.out.println("The number which are dividual by either 3 or 5 are :-");
		for(int i =a; i<=b; i++)
		{
		    if ((i%3==0) && (i%5!=0))		    	
		        System.out.println(i);	
		    
		    if ((i%3!=0) && (i%5==0))
	        	System.out.println(i);
	    }
 }
}