/**
 * 
 */
package kbinaryTree;

import crackingTheCode.BinaryNode;

/**
 * @author Minal
 *
 */
public class BinaryTreeNode {

	/**
	 * 
	 * 
	 */
	
	private int data;
	private BinaryTreeNode left;
	private BinaryTreeNode right;
	
	public BinaryTreeNode() {
		// TODO Auto-generated constructor stub
		data=0;
		left=null;
		right=null;
		
	}
	public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right){
		this.data=data;
		this.left=left;
		this.right=right;
	}
	public BinaryTreeNode(int d){
		this.data=d;
		left=null;
		right=null;
	}
	
	
	public int getData(){
		return this.data;
	}
	
	public BinaryTreeNode getLeft(){
		return this.left;
	}

	public BinaryTreeNode getRight(){
		return this.right;
	}
	

	public void setData(int d){
		this.data=d;
	}
	
	public void setLeft(BinaryTreeNode left){
		this.left=left;
	}
	
	public void setRight(BinaryTreeNode right){
		this.right=right;
	}

}
