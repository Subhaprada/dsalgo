package com.git.dsalgo.linklist.main;

import com.git.dsalgo.linklist.LinkedOperation;
import com.git.dsalgo.linklist.model.LinkedList;
import com.git.dsalgo.util.LinkListUtil;

/* length of link list*/

public class LinkListLength {
	
	
	public static void main(String[] atgs) {
		 LinkedList head = createLinkList();
		 LinkedOperation oper = new LinkedOperation();
		 oper.showLinkList(head);
		System.out.println( "length of list::"+oper.findLengthOfList(head));
		 
	}
	
	private static LinkedList createLinkList() {
		LinkedList head = LinkListUtil.createHead(3);
		LinkedList nod1 = LinkListUtil.createNode(4);
		LinkedList nod2 = LinkListUtil.createNode(5);
		LinkedList nod3 = LinkListUtil.createNode(6);
		LinkListUtil.linkNode1ToNode2(head, nod1);
		LinkListUtil.linkNode1ToNode2(nod1, nod2);
		LinkListUtil.linkNode1ToNode2(nod2, nod3);
		 return head;
	}

}
