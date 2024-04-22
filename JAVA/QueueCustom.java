package com.assignments;

import java.util.ArrayList;
import java.util.List;

public class QueueCustom <E> {
	
	   List <E> queue; 
		
		public QueueCustom() {
			super();
			queue = new ArrayList<>();
		}
		
		public void enqueue(E ele) {
			queue.add(ele);
		}
		
		public void dequeue() {
			if(!queue.isEmpty()) {
		        queue.remove(queue.size()-1);
			}
			else {
				System.out.println("No element in queue");
			}
		}
		
		public E peek() {
			if(isEmpty()) {
				System.out.println("No element in queue");
			}
			return queue.get(0);
		}
		
		public boolean isEmpty() {
			return queue.isEmpty();
		}

	public static void main(String[] args) {
		
		QueueCustom qu = new QueueCustom();
	    qu.enqueue(4);
	    qu.enqueue(5);
	    qu.enqueue(6);
	    System.out.println(qu.peek());
	    
	    qu.dequeue();
	    qu.dequeue();
	    qu.dequeue();
	    
        boolean f = qu.isEmpty();
        System.out.println(f);
	}
  }

