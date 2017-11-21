package com.git.dsalgo.linklist.model;

import com.git.dsalgo.tree.model.TreeNode;

	
	
public  class LevelTreeNode {
		
		public LevelTreeNode() {
			super();
		}
		public LevelTreeNode(TreeNode node,int level) {
			this.node = node;
			this.level = level;
		}
		
		private int level;
		private TreeNode node;
		public int getLevel() {
			return level;
		}
		public void setLevel(int level) {
			this.level = level;
		}
		public TreeNode getNode() {
			return node;
		}
		public void setNode(TreeNode node) {
			this.node = node;
		}
		
	}

