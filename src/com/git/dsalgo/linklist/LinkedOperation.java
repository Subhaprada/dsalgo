package com.git.dsalgo.linklist;

import com.git.dsalgo.linklist.model.LinkedList;

public class LinkedOperation {
	
	public  void showLinkList(LinkedList head) {
		if (head == null) {
			return;
		}
		LinkedList cur = head;
		while(cur != null) {
			System.out.print(cur.getData() + "->");
			cur = cur.getNextNode();
			
		}
		System.out.print(  "NULL\n");
	}
	
	public  int findLengthOfList(LinkedList head) {
		int length =0 ;
		if (head == null) {
			return length;
		}
		LinkedList cur = head;
		
		while(cur != null) {
			length++;
			cur = cur.getNextNode();
			
		}
		return length;
	}


}
