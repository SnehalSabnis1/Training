package com.assignments;

import java.util.Scanner;

public class LinearSearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter "+n+" numbers");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.println("Enter the search value");
	    int ind = sc.nextInt();
	    int flag = 0;
		for(int i=0;i<n;i++) {
			if(a[i] == ind) {
				System.out.println("value is present in the array "+i);
				flag = 1;
				break;
			} 
  }
		if(flag == 0) {
			System.out.println("Value is not present");
        }
	}
}