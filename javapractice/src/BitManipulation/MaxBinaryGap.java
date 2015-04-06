/**
 * 
 */
package BitManipulation;

/**
 * @author Minal
 *
 */
public class MaxBinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int r=findMaxBinaryGap(n);
		System.out.println("Max gap is="+r);

	}

	/**
	 * @param n
	 * @return
	 */
	private static int findMaxBinaryGap(int n) {
		// TODO Auto-generated method stub
		int max=0;
		int count=-1;
		int r=0;
		while(n>0){
			r=n&1; //got the last bit & wil give last bit
			n=n>>1; //right shift
			
			if(r==0&& count>=0){
				count++;
				
			}
			if(r==1){
				max=count>max?count:max;
				count=0; // 0 sugest it struct to one 1 and finding for other 1
			}
		}
		return max;
	}

}
