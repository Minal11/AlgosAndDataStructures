/**
 * 
 */
package projectEuler;

/**
 * @author Minal
 *
 */
public class LargestPalindromeProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LargestPalindromeProduct l=new LargestPalindromeProduct();
		l.solve();
		
		System.out.println("largerst palindrome number="+largestPalindrome+" "+"("+number1+","+number2+")");

	}
	public void solve(){
		for(int i=100;i<1000;i++){
			for(int j=100;j<1000;j++){
				long pro=calculateProduct(i,j);
				boolean b=isPalindrome(pro);
				if(b){
					boolean val=isMax(pro);
					if(val){
						largestPalindrome=pro;
						number1=i;
						number2=j;
						
					}
				}
			}
		}
	}
	
	public boolean isPalindrome(long pro){
		long palindrome=pro;
		long reverse=0;
		
		while(palindrome!=0){
			long remainder=palindrome%10;
			reverse=reverse*10+remainder;
			palindrome=palindrome/10;
		}
		if(pro==reverse){
			return true;
		}
		return false;
	}
	
	public long calculateProduct(int n1, int n2){
		
		product=n1*n2;
			//System.out.println("product"+product);
		return product;
	}
	
	public boolean isMax(long pro){
		if(pro>max){
			max=pro;
		//	System.out.println("max"+max +"and"+pro);
			return true;
		}
		return false;
	}
	
	private static long max=0;
	private static long product;
	private static long largestPalindrome;
	private static int number1;
	private static int number2;

}
