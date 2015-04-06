/**
 * 
 */
package kSearching;

/**
 * @author Minal
 *
 */
public class BinarySearchIterative {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,2,4,7,12,16,20};
		
		if(BinarySearch(a,16)){
			System.out.println("Found");
		}else
			System.out.println("not found");
		

	}

	/**
	 * @param i
	 */
	private static boolean BinarySearch(int[] a, int n) {
		// TODO Auto-generated method stub
		int len=a.length;
		int low=0;
		int high=len-1; 
		while(low<=high){
			int mid=low+(high-low)/2;
			if(a[mid]==n)
				return true;
			else if(a[mid]<n)
				low=mid+1;
			else
				high=mid-1;
		}
		
		return false;
	}

}
