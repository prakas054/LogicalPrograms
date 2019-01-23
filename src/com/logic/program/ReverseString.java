package com.logic.program;

public class ReverseString {

	public static void main(String[] args) {
		String input = "india is big country";
		
        byte [] strAsByteArray = input.getBytes(); // getBytes() method use to convert string into bytes[]
 
        System.out.println( strAsByteArray);
        
        byte [] result =  new byte [strAsByteArray.length]; //creating a empty result type byte array of size equall to length of input string
        
        
       //System.out.println(result);
      // System.out.println(new String(result));
      
        System.out.println(new String(strAsByteArray));
        
 
        // Store result in reverse order into the
        // result byte[]   
        for (int i = 0; i<strAsByteArray.length; i++)
        	
            result[i] = strAsByteArray[strAsByteArray.length-i-1];

        System.out.println(new String(result));
        
        System.out.println("--------------------------------------------");
        byte [] abc =  new byte [6]; 
        System.out.println(abc);
        System.out.println(new String(abc));
	}

}
