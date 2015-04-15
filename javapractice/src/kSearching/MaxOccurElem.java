/**
 * 
 */
package kSearching;

import java.util.*;
/**
 * @author Minal
 *
 */
public class MaxOccurElem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max=0;
		int maxelem=Integer.MIN_VALUE;
		// TODO Auto-generated method stub
		int[] a=new int[]{1,1,1,2,4,5,3,2};
		Map<Integer, Integer> hs=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++){
			if(hs.containsKey(a[i])){
				int c=hs.get(a[i]);
				hs.put(a[i], ++c);
			}
			else
				hs.put(a[i], 1);
		}
		System.out.println(hs);
		for(Integer key:hs.keySet()){
			int val=hs.get(key);
			if(val>max){
				max=val;
				maxelem=key;
			}
			
		}
	System.out.println("max elem="+maxelem+"==="+max);
		
		

	}

}
