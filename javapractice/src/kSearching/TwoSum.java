/**
 * 
 */
package kSearching;

import java.util.*;
/**
 * @author Minal
 *
 */
public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers=new int[]{1,12,3,8,5};
		int target=20;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] result = new int[2];
	 
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(numbers[i])) {
				int index = map.get(numbers[i]);
				result[0] = index+1 ;
				result[1] = i+1;
				break;
			} else {
				map.put(target - numbers[i], i);
			}
		}
	 System.out.println(map);
		System.out.println(result[0]+" "+result[1]);
	}

}
