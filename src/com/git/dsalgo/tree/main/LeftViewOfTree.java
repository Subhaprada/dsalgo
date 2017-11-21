package com.git.dsalgo.tree.main;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

import com.git.dsalgo.linklist.model.LevelTreeNode;
import com.git.dsalgo.tree.model.TreeNode;
import com.git.dsalgo.util.BinaryTreeUtil;

public class LeftViewOfTree {

	public static void main(String[] args) {
		
		TreeNode root = BinaryTreeUtil.createBinaryTree();
		
		leftView(root);

	}
	
	private static void leftView(TreeNode root) {
		if (root == null)
			return;
		Map<Integer,TreeNode> map = new TreeMap<>();
		
		LevelTreeNode levelNode = new LevelTreeNode(root,0);
		Queue<LevelTreeNode> item = new LinkedList<>();
		
		item.add(levelNode);
		System.out.println(root.getData());
		while( !item.isEmpty()) {
			LevelTreeNode itemLevelNode = item.remove();
			TreeNode node = itemLevelNode.getNode();
			int level = itemLevelNode.getLevel();
			//if (!map.containsKey(level)) {
				map.put(level, node);
			//}
			
			if (node.getLeft() != null) {
				LevelTreeNode levelNodeItem = new LevelTreeNode(node.getLeft(),level-1);
				item.add(levelNodeItem);
				
			}
			if (node.getRight() != null) {
				LevelTreeNode levelNodeItemRight = new LevelTreeNode(node.getRight(),level-1);
				item.add(levelNodeItemRight);
				
			}
			
			
		}
		
	  for (Map.Entry<Integer, TreeNode> entry : map.entrySet())		 {
		  System.out.print(entry.getValue().getData() + " ");
	  }
		
		
	}

	
	

}

