/**
 * 
 */
package programcreek;
import java.io.*;
import java.util.*;
/**
 * @author Minal
 *
 */
public class WordLadder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hit";
		String b="cog";
		HashSet<String> hs=new HashSet<String>();
		hs.add("hot");
		hs.add("dot");
		hs.add("dog");
		hs.add("lot");
		hs.add("log");

		int res=ladderLength(a,b,hs);
		System.out.println(res);
		
		
	}

	/**
	 * @param a
	 * @param b
	 * @param hs
	 * @return
	 */
	private static int wordladder(String start, String end, HashSet<String> hs) {
		// TODO Auto-generated method stub
		int len=0;
		for(int i=0;i<start.length();i++){
			char[] startArr = start.toCharArray();
			
			 for(char c='a'; c<='z'; c++){
		
	                if(c==start.toCharArray()[i]){
	                    continue;
	                }
	                startArr[i] = c;
	                String temp = new String(startArr);
	                System.out.println(temp);
	                if(hs.contains(temp)){
	                    len++;
	                    start = temp;
	                    if(temp.equals(end)){
	                        return len;
	                    }
	                }
	                
			 } //this functions have bug run for only 1 length string
			 
		}
		
		return len;
	}

	
	//bfs 
	public static int ladderLength(String start, String end, HashSet<String> dict) {
		if (dict.size() == 0)
			return 0;
	 
		dict.add(end);
	 
		LinkedList<String> wordQueue = new LinkedList<String>();
		LinkedList<Integer> distanceQueue = new LinkedList<Integer>();
	 
		wordQueue.add(start);
		distanceQueue.add(1);
	 
		//track the shortest path
		int result = Integer.MAX_VALUE;
		while (!wordQueue.isEmpty()) {
			String currWord = wordQueue.pop();
			Integer currDistance = distanceQueue.pop();
	 
			if (currWord.equals(end)) {
				result = Math.min(result, currDistance);
				
			}
			System.out.println(currDistance+" "+currWord);
			for (int i = 0; i < currWord.length(); i++) {
				char[] currCharArr = currWord.toCharArray();
				for (char c = 'a'; c <= 'z'; c++) {
					currCharArr[i] = c;
	 
					String newWord = new String(currCharArr);
					if (dict.contains(newWord)) {
						wordQueue.add(newWord);
						distanceQueue.add(currDistance + 1);
						dict.remove(newWord);
					}
				}
			}
		}
	 
		if (result < Integer.MAX_VALUE)
			return result;
		else
			return 0;
	}
	
}
