package com.assignments;

public class RecursiveFibonacci {
	
	static int fib(int num)
	{
		if(num<=1)
			return num;
		return fib(num-1) + fib(num-2);
	}

    public static void main(String args[])
    {
    	
        int num = 11;
        System.out.println(num+" th Fibonacci Number " +fib(num));        
    }
}