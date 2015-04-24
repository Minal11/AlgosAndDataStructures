/**
 * 
 */
package InterviewQuestion;
import java.util.*;
/**
 * @author Minal
 *
 */
public class SubtractString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="minal";
		String s2="tina";
		
		Set<Character> set=new HashSet<Character>();
		
		for(int i=0;i<s1.length();i++){
			set.add(s1.charAt(i));
		}
		for(int i=0;i<s2.length();i++){
			if(set.contains(s2.charAt(i))){
				set.remove(s2.charAt(i));
			}
		}
		
		for(Character c: set){
			System.out.println(c);
		}
		

	}

}
