package com.git.dsalgo.util;

import com.git.dsalgo.linklist.model.LinkedList;

public class LinkListUtil {

	public static LinkedList createHead(int value) {

		LinkedList head = new LinkedList(value, null);
		return head;
	}

	public static LinkedList linkNode1ToNode2(LinkedList node1, LinkedList node2) {
		node1.setNextNode(node2);

		return node1;
	}
	
	public static LinkedList createNode(int val) {
		LinkedList node = new LinkedList(val, null);

		return node;
	}
	
	public static LinkedList createLinkList() {
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
