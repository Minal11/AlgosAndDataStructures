/**
 * 
 */
package programcreek;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Minal
 *
 */
public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> dict = new HashSet<String>();
		dict.add("go");
		dict.add("goal");
		dict.add("goals");
		dict.add("special");
		
	 
		StringBuilder sb = new StringBuilder();
	 
		for(String s: dict){
			sb.append(s + "|");
		}
	
		String pattern = sb.toString().substring(0, sb.length()-1);

		pattern = "("+pattern+")*";
		
		Pattern p = Pattern.compile(pattern);
		
		Matcher m = p.matcher("goalspecials");
		
	 
		if(m.matches()){
			System.out.println("match");
		}
		else
			System.out.println("no match");

		System.out.println(wordBreak("goalsgoalgo",dict));
	}

	/**
	 * @param string
	 * @param dict
	 */
	private static boolean wordBreak(String string, HashSet<String> dict) {
		// TODO Auto-generated method stub
		boolean val=wordhelper(string,dict,0);
		return val;
	}

	/**
	 * @param string
	 * @param dict
	 * @param i
	 */
	private static boolean wordhelper(String s, HashSet<String> dict, int start) {
		// TODO Auto-generated method stub
		if(start==s.length())
				return true;
		
		for(String a:dict){
			int len=a.length();
			int end=start+len;
			if(end>s.length())
				continue;
			System.out.println(s.substring(start, end));
			if(s.substring(start, end).equals(a)){
				System.out.println("equals");
				if(wordhelper(s, dict, end))
					return true;
			}
		}
		
		return false;
		
	}

}
