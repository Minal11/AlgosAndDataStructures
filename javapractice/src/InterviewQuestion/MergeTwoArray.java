/**
 * 
 */
package InterviewQuestion;



import java.util.*;
public class MergeTwoArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,2,4,8,4};
		int[] b=new int[]{0,3,5,10,7};
		
		Set<Integer> set=new TreeSet<Integer>();
		
		for(int i=0;i<a.length;i++){
			set.add(a[i]);
		}
		for(int i=0;i<b.length;i++){
			set.add(b[i]);
		}
		System.out.println(set);
		
		ifrepeated();

	}

	/**
	 * 
	 */
	private static void ifrepeated() {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,2,4,7,6};
		int[] b=new int[]{0,2,5,10,7};
		int[] c=new int[a.length+b.length];
		Arrays.sort(a);
		Arrays.sort(b);
		
		for(int i=0, j=0;i<b.length+a.length && j<a.length ;i=i+2,j++){
			if(a[j]<b[j]){
				c[i]=a[j];
				c[i+1]=b[j];
			}
			else{
				c[i]=b[j];
				c[i+1]=a[j];
			}
		}
		
		
		for(int i=0;i<b.length+a.length;i++){
			System.out.print(c[i]+" ");
		}
	}

}

