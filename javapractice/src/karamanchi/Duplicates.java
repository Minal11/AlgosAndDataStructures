/**
 * 
 */
package karamanchi;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Minal
 *
 */
public class Duplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array=new int[]{1,2,3,4,5};
		Set<Integer> s=new HashSet<Integer>();
		for(int i=0;i<array.length;i++){
			s.add(array[i]);
		}

		if(s.size()==array.length)
			System.out.println("no duplicates");
		else
			System.out.println("duplicates");
	}

}
