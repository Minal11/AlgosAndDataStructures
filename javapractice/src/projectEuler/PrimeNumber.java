/**
 * 
 */
package projectEuler;

import java.util.Scanner;

/**
 * @author Minal
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int k=3;k<10;k+=2){
			int n=k;
			
			while(n>0){
				if(n%2!=0){
					System.err.println(k+" ");
				}
				n=n/2;
			}
		}
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPrimeNumbers(n);
		printPrimeNumbers2(n);

	}


		/**
	 * @param n
	 */
	private static void printPrimeNumbers2(int n) {
		// TODO Auto-generated method stub
		System.out.println("method efficient");
		for(int i=1;i<n;i++){
			if(i==1){
				continue;
			}
			else if(i==2){
				System.out.print(i+" ");
			}
			else{
				if(isPrime(i)){
					if(containsNum(i)==3){
						System.out.print("fizz"+ " ");
					}
					else if(containsNum(i)==5){
						System.out.print("buzz"+ " ");
					}
					else{
						System.out.print(i+" ");
					}
				}
			}
		}
		
	}

	public static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
		public static void printPrimeNumbers(int n){
			System.out.println("method 1");
			boolean flag=true;
			for(int j=2;j<=n;j++){
				//System.out.println(j);
				int numb=j;
				for(int k=2;k<numb;k++){
					if(numb%k==0){
						flag=false;
					}
				}
				if(flag){
					if(containsNum(numb)==3){
						System.out.print("fizz"+ " ");
					}
					else if(containsNum(numb)==5){
						System.out.print("buzz"+ " ");
					}
					else{
						System.out.print(numb+" ");
					}
					
				}
				flag=true;
			}
			
		}


		/**
		 * @return
		 */
		private static int containsNum(int n) {
			// TODO. Auto-generated method stub
			while(n>0){
				int rem=n%10;
				if(rem==3)
					return 3;
				else if(rem==5)
					return 5;
				n=n/10;
			}
			return 0;
		}
}
