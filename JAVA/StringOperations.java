package com.assignments;

import java.util.Scanner;

public class StringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the strings to operate");
		String a = sc.next();
		String b = sc.next();
		String ans = stringOperations(a,b);
		System.out.println(ans);
	}
     
	private static String stringOperations(String a, String b) {
		// TODO Auto-generated method stub
		if(a.length() == 0 && b.length() == 0)
			return ("The strings are empty");
		String con = a + b;
		System.out.println(con);
		StringBuilder st = new StringBuilder();
		for(int i=con.length()-1;i>=0;i--) {
			char ch = con.charAt(i);
			st.append(ch);
	}
	System.out.println(st.toString());
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the length of the middle string to cut");
	int n = sc.nextInt();
	if(n>st.length())
	  return("Length is greater than actual string");
	  else {
		  int start = (st.length()-n)/2;
		  return st.substring(start, start+n).toString();
		  }
	}
}
