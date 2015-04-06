/**
 * 
 */
package sorting;

/**
 * @author Minal
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	private static int[] unsortedArray;
	private static int[] temp;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		unsortedArray=new int[]{3,12,6,15,9,1,8,10};
		temp=new int[unsortedArray.length];
		mergeSort(0,unsortedArray.length-1);
		for(int l=0;l<unsortedArray.length;l++){
			System.out.print(unsortedArray[l]+" ");
		}

	}

		public static void mergeSort( int start, int end){
			if(start<end){
				int mid=start+(end-start)/2;
				mergeSort(0, mid);
				mergeSort( mid+1, end);
				merge(start, mid, end);
			}
		}
		
		public static void merge(int low,int middle, int high){

		    // Copy both parts into the helper array
		    for (int i = low; i <= high; i++) {
		      temp[i] = unsortedArray[i];
		    }

		    int i = low;
		    int j = middle + 1;
		    int k = low;
		    // Copy the smallest values from either the left or the right side back
		    // to the original array
		    while (i <= middle && j <= high) {
		      if (temp[i] <= temp[j]) {
		        unsortedArray[k] = temp[i];
		        i++;
		      } else {
		        unsortedArray[k] = temp[j];
		        j++;
		      }
		      k++;
		    }
		    // Copy the rest of the left side of the array into the target array
		    while (i <= middle) {
		      unsortedArray[k] = temp[i];
		      k++;
		      i++;
		    }

		  }
		}
