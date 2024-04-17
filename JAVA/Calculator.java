package com;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			System.out.println("Enter 2 Numbers");
			int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Enter your Choice");
			int ch=sc.nextInt();
			switch(ch)
			{

			case 1 :
				int add = a + b;
				System.out.println("Addition="+add);
				break;
			
			case 2 :
				int sub = a - b;
				System.out.println("Subtraction="+sub);
				break;
			
			case 3 :
				int mul = a * b;
				System.out.println("Multiplication="+mul);
				break;
			
			case 4 :
				double div = a / b;
				System.out.println("Division="+div);
				break;
			
			default :
				System.out.println("Invalid Choice");
				break;	
				
         	}
       }
  }