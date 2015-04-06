/**
 * 
 */
package sorting;

/**
 * @author Minal
 *
 */
public class SelectionSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray=new int[]{3,12,6,15,9};
		selectionSort(unsortedArray);


	}

	/**
	 * @param unsortedArray
	 */
	private static void selectionSort(int[] a) {
		// TODO Auto-generated method stub
		//// TODO Auto-generated method stub
		//find the min 
		//swap with the current position
		//repeat till array is sorted
		
		int n=a.length;
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		int min;
		for(int i=0;i<n;i++){
			min=i;
			for(int j=i+1;j<n;j++){ //iterate through complee array find min
				if(a[j]<a[min]){
					min=j;
				}
			}
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
				
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


