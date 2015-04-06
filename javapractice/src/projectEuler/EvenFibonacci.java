/**
 * 
 */
package projectEuler;

/**
 * @author Minal
 *
 */
public class EvenFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=1;
		int y=1;
		int s=0;
		
		int sum=0;
		long total=0;
		while(sum<4000000){
			s=x+y;
			sum=s;
			if(s%2==0){
				System.out.println(s);
				total=total+s;
			}
			x=y;
			y=s;
			s=0;
		}
		System.out.println("Sum of even-valued terms="+total);
	}

}
