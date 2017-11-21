package com.git.dsalgo.util;

import com.git.dsalgo.tree.model.TreeNode;

public class BinaryTreeUtil {
	
	
	public static TreeNode createBinaryTree() {
		TreeNode root = createTreeNode(1);
		TreeNode rootLeft = createTreeNode(2);
		TreeNode rootRight = createTreeNode(3);
		
		root.setLeft(rootLeft);
		root.setRight(rootRight);
		
		TreeNode rootLeftLeft = createTreeNode(4);
		TreeNode rootLeftRight = createTreeNode(5);
		rootLeft.setLeft(rootLeftLeft);
		rootLeft.setRight(rootLeftRight);
		
		TreeNode rootRightLeft = createTreeNode(6);
		TreeNode rootRightRight = createTreeNode(7);
		
		rootRight.setLeft(rootRightLeft);
		rootRight.setRight(rootRightRight);
		
		
		
		return root;
		
	}
	
	public static TreeNode createTreeNode(int data) {
		TreeNode node = new TreeNode();
		node.setData(data);
		return node;
	}

}
