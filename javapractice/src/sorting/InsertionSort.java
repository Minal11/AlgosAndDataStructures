/**
 * 
 */
package sorting;

/**
 * @author Minal
 *
 */
public class InsertionSort {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray=new int[]{3,12,6,15,9};
		insertionSort(unsortedArray);


	}

	/**
	 * @param unsortedArray
	 */
	private static void insertionSort(int[] a) {
		// TODO Auto-generated method stub
		//// TODO Auto-generated method stub
		//find the min 
		//swap with the current position
		//repeat till array is sorted
		
		int n=a.length;
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		
		for(int i=1;i<n;i++){
			int temp=a[i];
			int j=i;
			
			while(j>=0&&a[j-1]>temp){
				a[j]=a[j-1];
				
				j--;
			}
			a[j]=temp;
			System.out.println();
			for(int k=0;k<n;k++){
				System.out.print(a[k]+" ");
			}
			
		}
			
		
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}

}
