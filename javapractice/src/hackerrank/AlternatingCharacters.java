/**
 * 
 */
package hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Minal
 *
 */
public class AlternatingCharacters {

	public static void check(ArrayList<String> stringlist){
        int[] count=new int[stringlist.size()];
        for(int i=0;i<stringlist.size();i++){
            StringBuilder s=new StringBuilder();
            s.append(stringlist.get(i));
            System.out.println(s);
            int c=0;
            for(int j=0;j<s.length()-2;j++){
            	
                   
                    while(s.length()>=2&&s.charAt(j)==s.charAt(j+1)){
                        c++;
                        s.deleteCharAt(j+1);
                        
                    }
                    while(s.length()>=3&&s.charAt(j)!=s.charAt(j+2)){
                        c++;
                        s.deleteCharAt(j+2);
                       
                    }
                    
                
            }
            count[i]=c;
            
            
            
        }
        for(int i=0;i<count.length;i++){
        	System.out.println(count[i]);
        }
        
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        ArrayList<String> stringlist=new ArrayList<String>();
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            stringlist.add(sc.next());
        }
        check1(stringlist);
        
    }
    
    public static void check1(ArrayList<String> stringlist){
    	int[] count=new int[stringlist.size()];
    	for(int i=0;i<stringlist.size();i++){
    		String s=stringlist.get(i);
    		int c=0;
    		for(int j=1;j<s.length();j++){
    			if(s.charAt(j)==s.charAt(j-1))
    				c++;
    		}
    		count[i]=c;
    	}
    	
    	for(int i=0;i<count.length;i++){
        	System.out.println(count[i]);
        }
    	
    }
}
