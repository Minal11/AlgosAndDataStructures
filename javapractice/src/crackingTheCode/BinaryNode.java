/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class BinaryNode {
	
	int data;
	BinaryNode left;
	BinaryNode right;
	
	BinaryNode(){
		data=0;
		left=null;
		right=null;
	}
	BinaryNode(int data, BinaryNode left, BinaryNode right){
			this.data=data;
			this.left=left;
			this.right=right;
	}
	BinaryNode(int d){
		data=d;
		left=null;
		right=null;
	}
}
