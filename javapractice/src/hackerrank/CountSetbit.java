/**
 * 
 */
package hackerrank;

import java.util.Scanner;

/**
 * @author Minal
 *
 */
public class CountSetbit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int result=solution(a,b);
		System.out.println(result);

	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static int solution(int a, int b) {
		// TODO Auto-generated method stub
		int mul=a*b;
		int count = 0;
		  while(mul!=0)
		  {
		    count += mul & 1;
		    mul >>= 1;
		  }
		return count;
	}

}
