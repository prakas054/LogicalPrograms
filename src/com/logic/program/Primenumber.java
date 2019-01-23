package com.logic.program;
import java.util.Scanner;

public class Primenumber 
{
	int no, i;
		    
	  void Prime()
	   {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter any number : ");
			no = s.nextInt();
			
			if(no==1) System.out.println("Smallest Prime Number is 2");
			
	           for(i=2;i<no;i++)
	            {
	    	       if(no%i==0) //provide reminder known as modulus operator
	    	         {
	    		       System.out.println("It is not prime number");
	    		       break;
	    	         }
	            }
	            
	           if(no==i)
	            {
	    	      System.out.println("It is Prime Number");
	            }
	      s.close();     
		}
	  
}

