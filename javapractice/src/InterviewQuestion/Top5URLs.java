/**
 * 
 */
package InterviewQuestion;
import java.util.*;
import java.util.Map.Entry;
/**
 * @author Minal
 *
 */
public class Top5URLs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		Map<String,Integer> map=new HashMap<String, Integer>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			String s=sc.next();
			if(!map.containsKey(s)){
				map.put(s,1);
			}
			else{
				int val=map.get(s);
				map.put(s, val+1);
			}
				
		}
		ValueComparator vc=new ValueComparator(map);
		Map<String,Integer> tree=new TreeMap<String, Integer>(vc);
		tree.putAll(map);
		int top=3;
		Iterator it=tree.entrySet().iterator();
		while(it.hasNext() && top>=0){
			System.out.println(it.next());
			top--;
		}

	}

}
