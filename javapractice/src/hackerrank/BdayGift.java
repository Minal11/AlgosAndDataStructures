/**
 * 
 */
package hackerrank;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * @author Minal
 *
 */

public class BdayGift {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		
		    
		        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		        Scanner sc=new Scanner(System.in);
		        int sum=0;
		        int input=sc.nextInt();
		        for(int i=0;i<input;i++){
		            int ip=sc.nextInt();
		            
		            sum=sum+ip;
		             
		        }
		        if(sum%2==0){
		             System.out.println(sum/2+".0");
		        }
		        else{
		             System.out.println(sum/2+".5");
		        }
		      
		    }
		

	
}
