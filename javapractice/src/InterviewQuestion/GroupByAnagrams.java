/**
 * 
 */
package InterviewQuestion;
import java.util.*;
/**
 * @author Minal
 *given['cat','dog', 'god', 'gdo', 'act', 'tac']
 *o/p: [['cat', 'act', 'tac'], ['dog', 'god', 'gdo']]
 *time complexity : n*nlogn
 */
public class GroupByAnagrams {
	
	public static void main(String[] args){
		Set<String> dict=new HashSet<String>();
		dict.add("cat");
		dict.add("act");
		dict.add("tac");
		dict.add("dog");
		dict.add("god");
		dict.add("man");
		dict.add("dam");
		
		groupthem(dict);
		
	}
	
	//implement using fix coolean array of 256
	
	
	
	public static void groupthem(Set<String> dict){
		ArrayList<ArrayList<String>> result=new ArrayList<ArrayList<String>>();
		
		Map<String, Integer> sortedmap=new HashMap<String, Integer>();
		int c=0;
		Iterator it=dict.iterator();
		while(it.hasNext()){
			ArrayList<String> list=new ArrayList<String>();
			//ArrayList<String> list1=new ArrayList<String>();
			String str=(String) it.next();
			String sort=sort(str);
			if(!sortedmap.containsKey(sort)){
				//System.out.println(str+" new");
				sortedmap.put(sort, ++c);
				//System.out.println(sortedmap);
				list.add(str);
				result.add(list);
				//System.out.println(result);
			}
			else{
				//System.out.println(str+" old");
				int index=sortedmap.get(sort);
			//	System.out.println(index);
				//System.out.println(result.get(1));
				result.get(index-1).add(str);
				
			}
			
		}
	 System.out.println(result);
		
		
	}

	public static String sort(String s){
		String original = s;
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);
        return sorted;
	}
}
