/**
 * 
 */
package sorting;

/**
 * @author Minal
 *
 */
public class BuubleSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] unsortedArray=new int[]{3,12,6,15,9};
		bubbleSort(unsortedArray);

	}

	/**
	 * @param unsortedArray
	 */
	private static void bubbleSort(int[] a) {
		// TODO Auto-generated method stub
		int n=a.length;
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<n-i-1;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			
		}
		System.out.println();
		for(int i=0;i<n;i++){
			System.out.print(a[i]+" ");
		}
	}

}
