package com.math.operations;

public class ArithmaticOperation {

	public static void main(String[] args) {
		
		int a = 11;
        int b = 2;
        
        int sum = Addition.add(a,b);
        System.out.println("Summation = " +sum);
        
        int diff = Subtraction.subtract(a,b);
        System.out.println("Difference = " +diff);
        
        int pro = Multiplication.multiply(a,b);
        System.out.println("Multiplication = " +pro); 

        int quo = Division.divide(a,b);
        System.out.println("Division = " +quo);
     
	}

}
