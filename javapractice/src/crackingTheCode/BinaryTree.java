/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class BinaryTree {
	
	BinaryNode root;
	static int noOfNodes;
	BinaryTree(){
		root=null;
		noOfNodes=0;
	}
	
	static int getNoOfNodes(){
		return noOfNodes;
	}
	
	static int getHeight(BinaryNode node){
		if(node==null)
			return 0;
		return (1+Math.max(getHeight(node.left),getHeight(node.right)));
		
	}
	static int maxDepth(BinaryNode node){
		if(node==null)
			return 0;
		return (1+Math.max(getHeight(node.left),getHeight(node.right)));
		
	}
	static int minDepth(BinaryNode node){
		if(node==null)
			return 0;
		return (1+Math.min(getHeight(node.left),getHeight(node.right)));
		
	}
	
	static int getSize(BinaryNode node){
		if(node==null)
			return 0;
		return 1+getSize(node.left)+getSize(node.right);
	}
	
	static void preorder(BinaryNode node){
		if(node==null)
			return;
		System.out.print(node.data+" ");
		preorder(node.left);
		preorder(node.right);
	}
	
	static void inorder(BinaryNode node){
		if(node==null)
			return;

		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}
	
	static void postorder(BinaryNode node){
		if(node==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+ " ");
	}
	
	void insert(int d){
		this.root=insertNode(d,root);
	}
	BinaryNode insertNode(int d, BinaryNode node){
		
		if(node==null){
			node=new BinaryNode(d);
			noOfNodes++;
		}
		
		else if(getHeight(node.left)<=getHeight(node.right) && getSize(node.left)<=getSize(node.right)){
			//System.out.println(getHeight(node.left)+"-> left"+" "+getHeight(node.right)+"->right");
			//System.out.println(node.data+ " to the left");
			node.left=insertNode(d, node.left);
		}
		else{
		//	System.out.println(getHeight(node.left)+"-> left"+" "+getHeight(node.right)+"->right");
			//System.out.println(node.data+ " to the right");
			node.right=insertNode(d, node.right);
		}
		return node;
	}
	

}
