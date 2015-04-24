/**
 * 
 */
package InterviewQuestion;
import java.util.*;
/**
 * @author Minal
 *
 */
public class UpperLowerCase {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="abcdefghijklmnopqrstuvwxyz";
		int len=s.length();
		Set<String> unique=new HashSet<String>();
		Queue queue=new LinkedList<String>();
		
		unique.add(s);
		queue.add(s);
		
		while(!queue.isEmpty()){
			String str=(String) queue.remove();
			
			for(int i=0;i<len;i++){
				String temp=str;
			String t=temp.replace(temp.charAt(i),Character.toUpperCase(temp.charAt(i)));
			//	String t=temp.replace('a', 'A');
				//System.out.println(t);
			
				if(!unique.contains(t)){
					unique.add(t);
					queue.add(t);
				}
			}
			
		}
		
		System.out.println(unique);

	}

}
