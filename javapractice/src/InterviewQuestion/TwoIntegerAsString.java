/**
 * 
 */
package InterviewQuestion;

import java.math.BigInteger;

/**
 * @author Minal
 *
 */
public class TwoIntegerAsString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="12364634563254253465236";
		String s2="56701094401409403010150";
		
		BigInteger a=new BigInteger(s1);
		BigInteger b=new BigInteger(s2);
		

		BigInteger sum=a.add(b);
		System.out.println(sum.toString());

	}

}
