/**
 * 
 */
package programcreek;

import javax.imageio.IIOException;

/**
 * @author Minal
 *
 */
public class RotateArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array={1,2,3,4,5,6,7};
		rotate(array,7);
		rotateArray(array,4);
	}

		/**
	 * @param array
	 * @param i
	 */
	public static void rotateArray(int[] array, int k) {
		// TODO Auto-generated method stub
		//divide the array at k
		//roatate first part
		//rotate second  part
		//rotate whole array
		
		k=k%array.length;
		if(array==null || k<0)
			throw new IllegalArgumentException("Illegal exception");
		
		int firstLength=array.length-k;
		
		reverse(array,0,firstLength-1);
		System.out.println();
		for(int i:array)
			System.out.print(i+" ");
		reverse(array,firstLength,array.length-1);
		System.out.println();
		for(int i:array)
			System.out.print(i+" ");
		reverse(array,0,array.length-1);
		System.out.println();
		for(int i:array)
			System.out.print(i+" ");
		
	}

	public static void reverse(int[] array,int left, int right){
		if(array==null||array.length==1)
			return;
		while(left<right){
			int temp=array[left];
			array[left]=array[right];
			array[right]=temp;
			left++;
			right--;
			
		}
	}
		public static void rotate(int[] num, int k){
			if(k>=num.length)
				k=k%num.length; //if the index is grater than num of elements then rotate whole array
			
			int[] result=new int[num.length];
			for(int i=0;i<k;i++){
				result[i]=num[num.length-k+i];
			}
			int j=0;
			for(int x=k;x<num.length;x++){
				result[x]=num[j];
				j++;
			}
			
			System.arraycopy(result,0,num,0, num.length);
			for(int i:num)
			System.out.print(i+" ");
			
		}
}
