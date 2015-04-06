/**
 * 
 */
package kbinaryTree;
import java.util.*;

import crackingTheCode.BinaryNode;
/**
 * @author Minal
 *
 */
public class CreateBinaryTree {

	/**
	 * 
	 */
	public static int[] nodes;
	public static final int maxNodes=7;
	BinaryTreeNode root;
	public Queue queue;
	public CreateBinaryTree(int[] array) {
		// TODO Auto-generated constructor stub
		nodes=array;
		root=null;
		queue=new LinkedList<BinaryTreeNode>();
	}
	
	public BinaryTreeNode createTree(){
		this.root=insertNodes(root);
		inorder(this.root);
		System.out.println();
		preorder(this.root);
		System.out.println();
		postorder(this.root);
		return root;
	}
	public BinaryTreeNode insertNodes(BinaryTreeNode node){
		BinaryTreeNode temp=new BinaryTreeNode();
		temp.setData(nodes[0]);
		if(node==null){
			node=temp;
			queue.add(temp);
		}
	//	System.out.print(temp.getData()+"R ");
		int i=1;
		while(!queue.isEmpty()&& i<nodes.length){
			BinaryTreeNode l=new BinaryTreeNode();
			l.setData(nodes[i]);
			BinaryTreeNode r=new BinaryTreeNode();
			r.setData(nodes[++i]);
			BinaryTreeNode n=(BinaryTreeNode) queue.remove();
			//System.out.print(n.getData()+"R ");
			if(n.getLeft()==null){
				n.setLeft(l);
			//	System.out.print(n.getLeft().getData()+"L ");
				queue.add(l);
				
			}
			if(n.getRight()==null){
				n.setRight(r);
				//System.out.print(n.getRight().getData()+"Ri ");
				queue.add(r);
			}
			
			
			i++;
		}
		
			
		return node;
		
	}
	public static void inorder(BinaryTreeNode node){
		if(node==null)
			return;

		inorder(node.getLeft());
		System.out.print(node.getData()+" ");
		inorder(node.getRight());
	}
	
	public static void preorder(BinaryTreeNode node){
		if(node==null)
			return;
		System.out.print(node.getData()+" ");
		preorder(node.getLeft());
		
		preorder(node.getRight());
	}
	public static void postorder(BinaryTreeNode node){
		if(node==null)
			return;

		postorder(node.getLeft());
		
		postorder(node.getRight());
		System.out.print(node.getData()+" ");
	}
	
	
	public static void main(String[] args){
		int[] array=new int[]{1,2,3,4,5};
		CreateBinaryTree create=new CreateBinaryTree(array);
		create.createTree();
	}

}
