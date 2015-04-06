/**
 * 
 */
package crackingTheCode;

import java.util.Scanner;

/**
 * @author Minal
 *
 */
public class ConstructBalancedTree {
	ConstructBalancedTree(){
		btree = new BinaryTree();
	}
		
	
	public static BinaryTree btree;
	/**
	 * @param args
	 */
	public static BinaryTree createTree(){
		// TODO Auto-generated method stub
		
			@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int nodes = 0;
		try
		{
			System.out.println("Enter no of nodes");
			nodes = sc.nextInt();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		int d[] =new int[nodes];
		System.out.println("enter elements");
		for(int i=0;i<nodes;i++)
		{
			try
			{
				d[i] = sc.nextInt();
			}
			catch(Exception ex)
			{
				d[i]++;
				ex.printStackTrace();
			}
			
		}
		for(int i=0;i<nodes;i++)
		{
			btree.insert(d[i]);
		}
		return btree;
		/*
		btree.preorder(btree.root);
		System.out.println();
		btree.inorder(btree.root);
		System.out.println();
		btree.postorder(btree.root);
		System.out.println();
		*/
	}
	
	public static void printTraversal(BinaryTree bt){
		bt.preorder(btree.root);
		System.out.println();
		bt.inorder(btree.root);
		System.out.println();
		bt.postorder(btree.root);
		System.out.println();
	}

	/**
	 * @return
	 */
	public BinaryTree createMinimalHtBST() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nodes = 0;
		try
		{
			System.out.println("Enter no of nodes");
			nodes = sc.nextInt();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		int d[] =new int[nodes];
		System.out.println("enter elements");
		for(int i=0;i<nodes;i++)
		{
			try
			{
				d[i] = sc.nextInt();
			}
			catch(Exception ex)
			{
				d[i]++;
				ex.printStackTrace();
			}
			
		}
		
		btree.root=addToTree(d,0,d.length-1);
		return btree;
	}

	/**
	 * @param d
	 * @param i
	 * @param j
	 * @return
	 */
	public BinaryNode addToTree(int[] d, int start, int end) {
		// TODO Auto-generated method stub
		
		if(end<start)
			return null;
		int mid=(start+end)/2;
		BinaryNode node=new BinaryNode(d[mid]);
		node.left=addToTree(d, start, mid-1);
		node.right=addToTree(d, mid+1, end);
		return node;
	}

	/**
	 * @return
	 */
	
}
