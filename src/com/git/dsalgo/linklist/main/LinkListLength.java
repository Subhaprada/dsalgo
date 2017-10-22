package com.git.dsalgo.linklist.main;

import com.git.dsalgo.linklist.LinkedOperation;
import com.git.dsalgo.linklist.model.LinkedList;
import com.git.dsalgo.util.LinkListUtil;

/* length of link list*/

public class LinkListLength {
	
	
	public static void main(String[] atgs) {
		 LinkedList head = LinkListUtil.createLinkList();
		 LinkedOperation oper = new LinkedOperation();
		 oper.showLinkList(head);
		 System.out.println( "length of list::"+oper.findLengthOfList(head));
	}
	
	

}
