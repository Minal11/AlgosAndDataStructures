/**
 * 
 */
package programcreek;

/**
 * @author Minal
 *
 */
public class LongestPalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dabcba";
		System.out.println(longestPalindrome(s));
		System.out.println(Dpway(s));

	}
	/**
	 * @param s
	 * @return
	 */
	private static String Dpway(String s) {
		// TODO Auto-generated method stub
		if (s == null)
			return null;
	 
		if(s.length() <=1)
			return s;
	 
		int maxLen = 0;
		String longestStr = null;
	 
		int length = s.length();
	 
		int[][] table = new int[length][length];
	 
		//every single letter is palindrome
		for (int i = 0; i < length; i++) {
			table[i][i] = 1;
		}
		printTable(table);
		for (int i = 0; i <= length - 2; i++) {
			if (s.charAt(i) == s.charAt(i + 1)){
				table[i][i + 1] = 1;
				longestStr = s.substring(i, i + 2);
			}	
		}
		System.out.println(longestStr);
		printTable(table);
		for (int l = 3; l <= length; l++) {
			for (int i = 0; i <= length-l; i++) {
				int j = i + l - 1;
				if (s.charAt(i) == s.charAt(j)) {
					table[i][j] = table[i + 1][j - 1];
					if (table[i][j] == 1 && l > maxLen)
						longestStr = s.substring(i, j + 1);
				} else {
					table[i][j] = 0;
				}
				printTable(table);
			}
		}
	 
		
		return longestStr;
	}
	
	public static void printTable(int[][] x){
		for(int [] y : x){
			for(int z: y){
				System.out.print(z + " ");
			}
			System.out.println();
		}
		System.out.println("------");
	}
	//takes n3 time
	public static String longestPalindrome(String s){
		String longstr = null;
		int maxlen=0;
		
		for(int i=0;i<s.length();i++){
			for(int j=i+1;j<s.length();j++){
				int len=j-i;
				String sub=s.substring(i, j+1);
				if(isPalindrome(sub)){
					if(len>maxlen){
						longstr=sub;
						maxlen=len;
					}
				}
			}
		}
		
		return longstr;
		
	}

	
	public static boolean isPalindrome(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(s.length()-i-1)){
				return false;
			}
			
				
		}
		
		return true;
	}
}
