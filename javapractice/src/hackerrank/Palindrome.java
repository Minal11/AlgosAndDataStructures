/**
 * 
 */
package hackerrank;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Minal
 *
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="aaabbbbavafavafavaf";
		int length=str.length();
		Set unique=new HashSet();
		for(int i=1;i<=length;i++){
			check(str,i, unique); //i being number of character in string
		}
		System.out.println(unique);
	}

	/**
	 * @param str
	 * @param i
	 */
	public static void check(String str, int n, Set unique) {
		// TODO Auto-generated method stub
		
		int l=str.length();
		int end=l-1;
		for(int start=0;start<l && end<l;start++){
			end=start+n;
			String s=str.substring(start, end);
			StringBuilder sb=new StringBuilder();
			sb.append(s);
			
			if(s.equals(sb.reverse().toString())){
				if(!unique.contains(s)){
					unique.add(s);
				}
			}
			
		}
		
	}

}
