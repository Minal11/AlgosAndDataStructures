/**
 * 
 */
package BitManipulation;

/**
 * @author Minal
 *
 */
public class ReverseBits {

	private static int n=0;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		n=3;
		long num=3;
		long maxInt=(long)Math.pow(2, 32)-1;
		int r=0;
		
		for(int i=0;i<16;i++){
			 r=swapbits(n,i,32-i-1);
		}
		System.out.println("ans="+r);
		System.out.println("second answer"+reverseBits(n));
		System.out.println(maxInt-num);
	}

	/**
	 * @param n
	 * @param i
	 * @param j
	 * @return
	 */
	private static int swapbits(int n, int i, int j) {
		// TODO Auto-generated method stub
		
		int a=(n>>i)&1;
		int b=(n>>j)&1;
		
		if((a^b)!=0){
			//they are different
		//	System.out.println(n^=(1<<i)|(1<<j));
			return n^=(1<<i)|(1<<j);
		}
		
		return n;
	}

	public static int reverseBits(int n) {
		for (int i = 0; i < 16; i++) {
			n = swapBits(n, i, 32 - i - 1);
			//System.out.println(n);
		}
	 
		return n;
	}
	 
	public static int swapBits(int n, int i, int j) {
		int a = (n >> i) & 1;
		int b = (n >> j) & 1;
	 
		if ((a ^ b) != 0) {
			return n ^= (1 << i) | (1 << j);
		}
	 
		return n;
	}
	
}
