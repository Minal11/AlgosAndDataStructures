/**
 * 
 */
package hackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Minal
 *
 */
public class GameOfThrones1 {
    public static String check(String input){
        
        Set<Character> s=new HashSet<Character>();
         for(int i=0;i<input.length();i++){
             if(s.contains(input.charAt(i))){
                 s.remove(input.charAt(i));
             }
             else{
                 s.add(input.charAt(i));
             }
         }
         if(s.size()>1){
             return "NO";
         }
         else
             return "YES";
         
        
     }
     

     public static void main(String[] args) {
         Scanner myScan = new Scanner(System.in);
         String inputString = myScan.nextLine();
        
         String ans=check(inputString);
         // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
         System.out.println(ans);
         myScan.close();
     }

}
