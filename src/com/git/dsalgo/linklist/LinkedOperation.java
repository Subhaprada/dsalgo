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
	
	public LinkedList swapTwoNodes(int dataX,int dataY,LinkedList head) {
		
		LinkedList xPrev = null;
		LinkedList xCur = head;
		
		while(xCur != null && xCur.getData() != dataX) {
			xPrev = xCur;
			xCur = xCur.getNextNode();
		}
		
		LinkedList yPrev = null;
		LinkedList yCur = head;
		
		while(yCur != null && yCur.getData() != dataY) {
			
			yPrev = yCur;
			yCur = yCur.getNextNode();
		}
		
		if (xPrev == null && yPrev == null) {
			return null;
		}
		
		// prevNode next node should be y 
		if (xPrev != null) {
			xPrev.setNextNode(yCur);
		} else { // set head
			head = yCur;
		}
		
		if (yPrev != null) {// y prev node should point to x 
			yPrev.setNextNode(xCur);
		} else {
			head = xCur; // else it should be head
		}
		
		// set next node of x and y 
		
		LinkedList temp = xCur.getNextNode();
		xCur.setNextNode(yCur.getNextNode());
		yCur.setNextNode(temp);
		
		return head;
		
	}
	
	
	public LinkedList swapNodesInPair(LinkedList head) {
		if (head == null) {
			return null;
		}
		
		LinkedList temp1 = null;
		LinkedList newHead = null;
		
		while(head != null ) {
			
			if(temp1 != null) {
				temp1.getNextNode().setNextNode(head.getNextNode());
			}
			
			temp1 = head.getNextNode();
			head.setNextNode(head.getNextNode().getNextNode());
			
			temp1.setNextNode(head);
			
			head = head.getNextNode();
			
			if (newHead == null) {
				newHead = temp1;
			}
			
		}
		return newHead;
		
		
		
		
	}


}
