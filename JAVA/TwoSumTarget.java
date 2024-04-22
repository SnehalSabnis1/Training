package com.assignments;

import java.util.Scanner;

public class TwoSumTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of elements in array you want");
		int n = sc.nextInt();
		int a[] = new int [n];
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		System.out.println("Enter the target sum");
        int target = sc.nextInt();
         for(int i=0;i<a.length;i++) {
        	 for(int j=i+1;j<a.length;j++) {
        		if(a[i] + a[j] == target) {
        			System.out.println(a[i]+" + "+a[j]);
        		break;
        		}	else 
        			System.out.println("No match");
        	}
         }
	}
}
