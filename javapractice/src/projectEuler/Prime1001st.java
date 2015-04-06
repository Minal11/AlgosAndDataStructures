/**
 * 
 */
package projectEuler;

/**
 * @author Minal
 *
 */
public class Prime1001st {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=2;
		int primeCount=0;
		while(primeCount!=10001){
			
			boolean ch=checkPrime(number);
			if(ch){
				primeCount++;
				System.out.println("count="+primeCount+"and"+number);
			}
			number++;
		}
		
		
	}

	public static boolean checkPrime(int number){
		if(number<2){
			return false;
		}
		for(int i=2;i<number;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
}
