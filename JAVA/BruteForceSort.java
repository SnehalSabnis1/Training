package com.assignments;

public class BruteForceSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a[]= {45, 36, 2, 11, 56};
    for(int i=0;i<a.length;i++) {
    	
    	for (int j=i+1;j<a.length;j++) {
    		
    		int res = 0;
    		if(a[j] < a[i]) {
    			
    			res = a[i];
    			a[i] = a[j];
    			a[j] = res;
    		}
    	}
    	System.out.println(a[i]+ "");
    }
  }
}
