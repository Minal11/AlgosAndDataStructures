/**
 * 
 */
package crackingTheCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.xml.sax.HandlerBase;

/**
 * @author Minal
 *
 */
public class Question1_3 {

	/**Remove the duplicates from string
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abababababa";
		removeDuplicates1(s);
		removeDuplicates2(s);
		removeDuplicates3(s);
		
		
	
		}
	
	public static void removeDuplicates1(String str){
		//take a  checker
		int[] checker=new int[256];
		//they are set to 0
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			
			checker[ch]++;
		}
		
		StringBuilder sb=new StringBuilder(checker.length);
		for(int i=0;i<checker.length;i++){
			
			if(checker[i]>0){
				sb.append((char)i); //storing the alaphabhet not its count
			}
		}
		System.out.println(sb.toString());
	}
	
	//prints in order
	public static void removeDuplicates2(String str){
		boolean[] checker=new boolean[256];
		StringBuilder sb =new StringBuilder(checker.length);
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			
			if(!checker[ch]){
				checker[ch]=true;
				sb.append(ch);
			}
		}
		
	System.out.println(sb.toString());
	}
	
	//using hash set
	public static void removeDuplicates3(String str){
		StringBuilder sb =new StringBuilder();
		
		Set<Character> checker=new HashSet<Character>();
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(!checker.contains(ch)){
				checker.add(ch);
				sb.append(ch);
				
			}
			
		
		}
		System.out.println(sb.toString());
	}
}
