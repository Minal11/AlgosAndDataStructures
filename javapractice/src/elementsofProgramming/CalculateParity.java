/**
 * 
 */
package elementsofProgramming;

import java.util.Scanner;

/**
 * @author Minal
 *
 */
public class CalculateParity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long n=sc.nextInt();
		calculateParity(n);

	}
	public static void calculateParity(long x){
		short result=0;
		while(x!=0){
			result ^= 1;
			x &= (x - 1);
		}
		System.out.println(result);
	}
	

}
