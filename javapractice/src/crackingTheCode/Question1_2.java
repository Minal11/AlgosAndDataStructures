/**
 * 
 */
package crackingTheCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Minal
 *
 */
public class Question1_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s=new StringBuilder("hello World");
		System.out.println(s.reverse());
		String str="Hi I'm is minal";
		String[] buffer=str.split("\\s+");
		System.out.println(Arrays.toString(buffer));
		for(int j=(buffer.length)-1;j>=0;j--){
			System.out.print(buffer[j]+" ");
		}
		
		

	}

}
