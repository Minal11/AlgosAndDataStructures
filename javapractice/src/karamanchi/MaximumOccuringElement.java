/**
 * 
 */
package karamanchi;

/**
 * @author Minal
 *
 */
public class MaximumOccuringElement {

	private static final int INT_MIN = 0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar=new int[]{1,2,2,3,4,2,5,3};
		//n2 by looping over
		//nlogn by sorting
		//n hashtable but requires n space
		//so is the following technique. In first scan add n to each element
		//in second scan divide n check for maximum
		//this works only if ele is positive and its in range 
		int n=ar.length;
		int index=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			ar[ar[i]%n]+=n;
		}
		for(int i=0;i<n;i++){
			if(ar[i]/n>max){
				max=ar[i]/n;
				index=i;
			}
		}
		System.out.println("maximum occuring element "+max+" "+index);
	}

}
