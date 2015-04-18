/**
 * 
 */
package kbinaryTree;

import inheritance.B;

import java.util.Stack;

/**
 * @author Minal
 *
 */
public class MirrorTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{1,2,3,4,5};
		CreateBinaryTree create=new CreateBinaryTree(array);
		BinaryTreeNode root=create.createTree();
		System.out.println();
		System.out.println("Non-Recursive");
		
		inorder(root);
		System.out.println();
		
		
		mirrorTree2(root);
		inorder(root);
		System.out.println();

	}

	
	public static void inorder(BinaryTreeNode node){
		if(node==null)
			return;
		//you need Stack for non recursive
		Stack stack=new Stack();
		
		while(true){
			while(node!=null){
				
				stack.push(node);
				node=node.getLeft();
			}
			if(stack.isEmpty())
				break;
			node=(BinaryTreeNode) stack.pop();
			System.out.print(node.getData()+" ");
			node=node.getRight();
			
		}
		
	}
	
	
	
public static void mirrorTree2( BinaryTreeNode n){
		
		if(n==null)
			return;
		else{
		mirrorTree2(n.getLeft());
			mirrorTree2(n.getRight());
			BinaryTreeNode temp=n.getLeft();
			n.setLeft(n.getRight());
			n.setRight(temp);
			
		}
	
	}
}
