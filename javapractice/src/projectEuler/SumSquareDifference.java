/**
 * 
 */
package projectEuler;

/**
 * @author Minal
 *
 */
public class SumSquareDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		int sum=((n+1)*n)/2;
		int sumSquare=sum*sum;
		int squareSum=(n*(n+1)*((2*n)+1))/6;
		int difference=sumSquare-squareSum;
		System.out.println("Sum square difference="+difference);

	}

}
