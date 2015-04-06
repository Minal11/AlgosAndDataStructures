/**
 * 
 */
package inheritance;

/**
 * @author Minal
 *
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {


       
          static void quickSort(int[] ar) {
              int last=ar.length;
              int first=0;
              
              inplacequicksort(ar,first,last);
              
             // partitionArray(ar,0,last);
                  
                    
       }  
    
        static void inplacequicksort(int[] ar, int first, int last){
        	System.out.println("sfgfd");
        	if((last-first)>1){  
        		System.out.println("minal");
                int pivot=ar[last-1];
                int i=first,j=last-1;
                int p=last;
                
                while(ar[i]<pivot){
                    i++;
                }
                while(ar[j]>pivot){
                    j--;
                }
                if(i>=j){
                    swap(ar[i],pivot);
                }
                else{
                    swap(ar[i],ar[j]);
                }
              for(int k=0;k<ar.length;k++){
                  System.out.println(ar[k]);
              }
              
           
              
              
          }
        }
    static void swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
    }
    
        
 static void printArray(int[] ar, int  first, int last) {
         for(int k=first;k<last;k++){
            System.out.print(ar[k]+" ");
         }
           System.out.println("");
      }
       
      public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           quickSort(ar);
       }    
   }

