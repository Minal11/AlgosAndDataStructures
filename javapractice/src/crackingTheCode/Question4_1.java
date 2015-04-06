/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTree b=null;
		ConstructBalancedTree ct=new ConstructBalancedTree();
		b=ConstructBalancedTree.createTree();
		ct.printTraversal(b);
		if(isBalanced(b)){
			System.out.println("balanced");
		}else{
			System.out.println("not balanced");
		}
		
	}

	/**
	 * @param b
	 * @return
	 */
	private static boolean isBalanced(BinaryTree b) {
		// TODO Auto-generated method stub
	//System.out.println(b.root.data);
		
		//return false;
	return ((b.maxDepth(b.root)-b.minDepth(b.root))<=1);
	}

}
