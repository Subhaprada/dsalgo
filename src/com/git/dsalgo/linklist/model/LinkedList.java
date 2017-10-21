/**
 * 
 */
package com.git.dsalgo.linklist.model;

import java.io.Serializable;

/**
 * @author subhaprad
 *
 */
public class LinkedList implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int data;

	private LinkedList nextNode;
	
	public LinkedList(int data, LinkedList node) {
		super();
		this.data = data;
		this.nextNode = node;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public LinkedList getNextNode() {
		return nextNode;
	}
	public void setNextNode(LinkedList node) {
		this.nextNode = node;
	}
	
	
	

}
