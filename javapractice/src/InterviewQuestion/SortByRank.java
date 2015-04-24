/**
 * 
 */
package InterviewQuestion;
import java.util.*;
/**
 * @author Minal
 *
 */
public class SortByRank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		map.put("Google", 1);
		map.put("Amazon", 5);
		map.put("Apple",3);
		map.put("Cisco", 4);
		map.put("Yahoo", 2);
		
		System.out.println(map);
		ValueComparator vc=new ValueComparator(map);
		TreeMap<String, Integer> tree=new TreeMap<String, Integer>(vc);
		tree.putAll(map);
		
		System.out.println(tree);
		
			

	}

}
