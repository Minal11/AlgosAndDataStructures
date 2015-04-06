/**
 * 
 */
package BitManipulation;

/**
 * @author Minal
 *
 */
public class GetBit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=37;
		getbit(n,5);
		
	}
	public static  void getbit(int n, int i){
		System.out.println(n&(1<<i));
		
	}

}
