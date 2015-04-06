/**
 * 
 */
package projectEuler;

/**
 * @author Minal
 *
 */
public class MultipleOf3 {                                                          

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=1;i<1000;i++){
			if(i%3==0 || i%5==0){
				sum=sum+i;
			}
		}
		System.out.println("Sum="+ sum);
	}

}
