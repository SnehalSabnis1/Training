package com.assignments;

import java.util.Scanner;

class Prime {
    
	public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the number to check Prime");
    int a = sc.nextInt();
    int flag = 0;
    for(int i=2; i<a/2; i++) {
    	if(a % i == 0) {
    		System.out.println(" Not a Prime Number");
            flag = 1;
    		break;
    	}
    	
	   }
       if(flag == 0)
    	   System.out.println(a+ " is a prime number");	 
		}

	}

