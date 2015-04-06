/**
 * 
 */
package hackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Minal
 *
 */
public class GemOfStones {
	 public static int check(ArrayList<String> rocks){
	        int count=0;
	      Map<Character, Integer> m=new HashMap<Character, Integer>();
	        String s=rocks.get(0);
	        for(int i=0;i<s.length();i++){
	            m.put(s.charAt(i),1);
	        }
	       
	  
	        for(int i=1;i<rocks.size();i++){
	            String str=rocks.get(i);
	            for(int j=0;j<str.length();j++){
	              //  System.out.println(str);
	              if(m.containsKey(str.charAt(j))){
	                  // System.out.println(true);
	                  int c=(Integer)m.get(str.charAt(j));
	                 /* c++;*/
	                  if(c==(i)){
	                 //   System.out.println(str.charAt(j)+" " +i);   
	                  m.put(str.charAt(j),i+1);
	                  }
	              }
	                               
	            }
	             
	        }
	       for ( Map.Entry<Character, Integer> entry : m.entrySet()) {
	   // System.out.println(entry.getKey()+" " +entry.getValue()+" "+rocks.size());
	    Integer val = entry.getValue();
	           if(val==rocks.size()){
	               count++;
	           }
	    
	}
	        return count;
	    }

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	          Scanner myScan = new Scanner(System.in);
	        int n=myScan.nextInt();
	       ArrayList<String> res=new ArrayList<String>();
	        for(int i=0;i<n;i++){
	             res.add(myScan.next());    
	        }
	        
	        
	         int ans=check(res);
	         // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
	         System.out.println(ans);
	         myScan.close();
	    }

}
