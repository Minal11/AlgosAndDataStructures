/**
 * 
 */
package yelpQuestions;
import java.util.*;
/**
 * @author Minal
 *
 */
public class PowerSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] set=new char[]{'a','b','c'};
		printPowerSet(set,set.length);

	}

	public static void printPowerSet(char[] set, int n){
		
		int powerSetSize=(int) Math.pow(2, n);
		for(int i=0;i<powerSetSize;i++){
			for(int j=0;j<n;j++){
				if((i&(1<<j))!=0){
					
					System.out.print(set[j]+" ");
				}
			}
			System.out.println();
		}
	}
}
