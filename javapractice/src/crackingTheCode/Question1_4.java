/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question1_4 {

	/**if two strings are anagrams(they have same alaphabets reaaranging the strings
	 * @param args
	 * 1. they should have equal length
	 * 2. sort them but take 0(nlogn)
	 * 3. using checker o(n)
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="minal";
		String str2="konda";
		if(checkForAnagrams(str1,str2)){
			System.out.println("They are anagrams");
		}
		else{
			System.out.println("They are not anagrams");
		}
		
	}
	public static boolean checkForAnagrams(String str1,String str2){
		
		int[] checker=new int[256];
		if(str1.length()!=str2.length()){
			return false;
		}
		
		for(int i=0;i<str1.length();i++){
			char ch=str1.charAt(i);
			checker[ch]++;
		}
		
		for(int i=0;i<str2.length();i++){
			char ch=str2.charAt(i);
			checker[ch]--;
		}
		
		for(int j=0;j<checker.length;j++){
			if(checker[j]!=0){
				return false;
			}
		}
		
		return true;
		
		
	}
}
