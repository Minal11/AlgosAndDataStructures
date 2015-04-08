/**
 * 
 */
package kbinaryTree;
import java.util.*;
/**
 * @author Minal
 *
 */
public class NonRecursiveTraversal {

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
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);

	}
	public static void preorder(BinaryTreeNode node){
		if(node==null)
			return;
		//you need Stack for non recursive
		Stack stack=new Stack();
		
		while(true){
			while(node!=null){
				System.out.print(node.getData()+" ");
				stack.push(node);
				node=node.getLeft();
			}
			if(stack.isEmpty())
				break;
			node=(BinaryTreeNode) stack.pop();
			node=node.getRight();
			
		}
		
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
	public static void postorder(BinaryTreeNode node){
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
			
			node=node.getRight();
			System.out.println(node.getData());
		}
		
	}
	

}
