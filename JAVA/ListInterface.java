package com.assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInterface {
	
	public static void removeEverySecEle(List<Integer>list) {
		for(int i = list.size()-1; i>=0; i--) {
			if(i % 2 != 0) {
				list.remove(i);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		List<Integer> list = new ArrayList<Integer> 
		(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
			
		System.out.println("Main List :"+list);
		
		removeEverySecEle(list);
		
		System.out.println("After removing every second element the list is :"+list);

	}

}
