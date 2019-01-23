package com.logic.program;
// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
class Temp
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
    Temp()
    {
        this(5);   // calls constructor 2
        System.out.println("The Default constructor");
    }
 
    // parameterized constructor 2
    Temp(int x)
    {       
        this(5, 15);   // calls constructor 3
        System.out.println(  "\t" + x);
    }
 
    // parameterized constructor 3
    Temp(int x, int y)
    {
        System.out.println( "\t" + (x * y));
    }  
        
    // After invoking last constructor the program get BackTrack....
       
    public static void main(String args[])
    {
        // invokes default constructor first
        new Temp();
    }
}