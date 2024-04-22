package com.assignments;

public class RecursiveSumArray {
	
	static int a[]= {1,2,3,4,5,6};
	
	static int findSum(int a[], int n)
	{
		if(n<=0)
		return 0;
		return (findSum(a, n-1) + a[n-1]);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(findSum(a,a.length));
	}
}