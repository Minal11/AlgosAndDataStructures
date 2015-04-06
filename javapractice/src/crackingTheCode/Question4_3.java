/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question4_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b=null;
		ConstructBalancedTree ct=new ConstructBalancedTree();
		b=ct.createMinimalHtBST();
		ct.printTraversal(b);
	}

}
