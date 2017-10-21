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

}
