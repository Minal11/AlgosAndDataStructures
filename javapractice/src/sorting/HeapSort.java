/**
 * 
 */
package sorting;

/**
 * @author Minal
 *
 */
public class HeapSort {

	public static int N;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array=new int[]{25,12,1,8,3,15,11};
		heapsort(array);
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		
	}
	
	public static void heapsort(int[] A){
		buildheap(A);
		for(int i=2;i<A.length;i++){
			swap(A,i,1);
			
		}
	}

	/**
	 * @param a
	 */
	public static void buildheap(int[] A) {
		// TODO Auto-generated method stub
		N=A.length-1;
		for(int i=N;i>=0;i--){
			heapify(A,i);
		}
		
		
	}

	/**
	 * @param a
	 * @param i
	 */
	public static void heapify(int[] A, int i) {
		// TODO Auto-generated method stub
		int left=2*i;
		int right=2*i+1;
		int max=i;
		
		if(left<N && A[left]>A[max])
			max=left;
		if(right<N && A[right]>A[max])
			max=right;
		
		if(max!=i){
			swap(A, max, i);
			heapify(A,max);
		}
		
	}

	public static void swap(int[] arr, int i, int j){

        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
	}
	
}
