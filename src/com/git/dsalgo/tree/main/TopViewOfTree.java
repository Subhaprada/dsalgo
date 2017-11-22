package com.git.dsalgo.tree.main;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import com.git.dsalgo.linklist.model.LevelTreeNode;
import com.git.dsalgo.tree.model.TreeNode;
import com.git.dsalgo.util.BinaryTreeUtil;

public class TopViewOfTree {
	
	public static void main(String[] args) {
		TreeNode root = BinaryTreeUtil.createBinaryTree();
		
		topViewOfTree(root);
	}

	private static void topViewOfTree(TreeNode root) {
		
		if (root == null) {
			return;
		}
		
		LevelTreeNode node = new LevelTreeNode(root,0);
		
		Queue<LevelTreeNode> item = new LinkedList<>();
		
		item.add(node);
		Map<Integer,Integer> map  = new TreeMap<>();
		//set.add(root.getData());
		
		while(!item.isEmpty()) {
			LevelTreeNode tempNodeItem = item.remove();
			
			TreeNode itemNode = tempNodeItem.getNode();
			if (!map.containsKey(tempNodeItem.getLevel())) {
				map.put(tempNodeItem.getLevel(),itemNode.getData());
			}
				
			if (itemNode.getLeft() != null) {
				LevelTreeNode tmpItem = new LevelTreeNode(itemNode.getLeft(),tempNodeItem.getLevel() - 1);
				
				item.add(tmpItem);
			}
			if (itemNode.getRight() != null) {
				LevelTreeNode tmpItem = new LevelTreeNode(itemNode.getRight(),tempNodeItem.getLevel() + 1);
				item.add(tmpItem);
			}
			
		}
		map.forEach((k,v) -> {
			System.out.println(v);
		});
		
	}

}
