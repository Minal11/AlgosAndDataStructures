/**
 * 
 */
package InterviewQuestion;
import java.util.*;
/**
 * @author Minal
 *
 */
public class DotProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Integer> vector1=new HashMap<Integer, Integer>();
		
		int result=0;		
		Scanner sc=new Scanner(System.in);
		int first=sc.nextInt();
		int second=sc.nextInt();
		
		if(first!=second)
			result=-1;
		else{
			for(int i=0;i<first;i++){
				vector1.put(sc.nextInt(),sc.nextInt());
			}
			for(int i=0;i<second;i++){
				int index=sc.nextInt();
				if(vector1.containsKey(index)){
					result=result+(vector1.get(index)*sc.nextInt());
				}
				else{
					sc.nextInt();
				}
			}

		}
		
		System.out.println("Dot Product="+result);
	}

}
