/**
 * 
 */
package BitManipulation;

/**
 * @author Minal
 *
 */
public class NumberOf1Bits {

	/** 32 bit unsigned integer
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=61;
		System.out.println(findNumberof1Bits(n));

	}

	/**
	 * @param n
	 * @return
	 */
	private static int findNumberof1Bits(int n) {
		// TODO Auto-generated method stub
		int count=0;
		while(n>0){
			int r=n&1;
			n=n>>1;
			if(r==1)
				count++;
		}
		
		
		return count;
	}

}
