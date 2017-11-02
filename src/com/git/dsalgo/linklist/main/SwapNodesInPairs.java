package com.git.dsalgo.linklist.main;

import com.git.dsalgo.linklist.LinkedOperation;
import com.git.dsalgo.linklist.model.LinkedList;
import com.git.dsalgo.util.LinkListUtil;

public class SwapNodesInPairs {

	public static void main(String[] args) {
		
		LinkedList head = LinkListUtil.createLinkList();
		 LinkedOperation oper = new LinkedOperation();
		 oper.showLinkList(head);
		 head = oper.swapNodesInPair(head);
		 oper.showLinkList(head);

	}

}
