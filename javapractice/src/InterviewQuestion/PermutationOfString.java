/**
 * 
 */
package InterviewQuestion;

/**
 * @author Minal
 * Find permutation of string, or anagrams of the string 
 * Best complexity is O(n*n!)
 * 
 *
 */
public class PermutationOfString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="minal";
		
		perm2(s);

	}

	public static void perm2(String s) {
	       int N = s.length();
	       char[] a = new char[N];
	       for (int i = 0; i < N; i++)
	           a[i] = s.charAt(i);
	       perm2(a, N);
	    }

	
	public static void perm2(char[] a,int n){
		
		if(n==1){
			System.out.println(a);
			
			
			return;
		}
		for(int i=0;i<n;i++){
			
			swap(a,i,n-1);
			
			perm2(a,n-1);
			
			swap(a,i,n-1);
			
			
		}
		
		
	}
	
	public static void swap(char[] a ,int i, int j){
		char c=a[i];
		a[i]=a[j];
		a[j]=c;
			
	}
}
