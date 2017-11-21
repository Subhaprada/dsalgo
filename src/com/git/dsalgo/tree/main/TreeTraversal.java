package com.git.dsalgo.tree.main;

import java.util.LinkedList;
import java.util.Queue;

import com.git.dsalgo.tree.model.TreeNode;
import com.git.dsalgo.util.BinaryTreeUtil;

public class TreeTraversal {

	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtil.createBinaryTree();
		System.out.println( " ****In order ****");
		traverseInOrderTree(root);
		System.out.println( " ****pre order ****");
		traversePreOrder(root);
		System.out.println( " ****Post order ****");
		traversePostOrder(root);
		
		System.out.println("*** Level order travesal ***");
		
		levelOrderTraversal(root);

	}

	private static void traversePostOrder(TreeNode root) {
		if(root == null) 
			return;
		
		traversePostOrder(root.getLeft());
		traversePostOrder(root.getRight());
		System.out.println(root.getData());
		
	}

	private static void traversePreOrder(TreeNode root) {
		
		if (root == null)
			return;
		 System.out.println(root.getData());
	    traversePreOrder(root.getLeft());
	    traversePreOrder(root.getRight());
	   
		
		
	}

	private static void traverseInOrderTree(TreeNode root) {
		
		
		if (root == null) {
			return;
		}
		
			
			traverseInOrderTree(root.getLeft());
			System.out.println(root.getData());
			traverseInOrderTree(root.getRight());
			
		
	}
	
	
	
	private static void levelOrderTraversal(TreeNode root) {
		if (root == null) 
			return;
		
		Queue< TreeNode> queue = new LinkedList<>();
		
		queue.add(root);
		
		while(!queue.isEmpty()) {
			int size =queue.size();
			while(size > 0) {
				TreeNode node = queue.remove();
				System.out.print(node.getData() + " ");
				if (node.getLeft() != null) {
					queue.add(node.getLeft());
				}
				if (node.getRight() != null) {
					queue.add(node.getRight());
				}
				size --;
			}
			System.out.println("");
			
		}
	}

}
