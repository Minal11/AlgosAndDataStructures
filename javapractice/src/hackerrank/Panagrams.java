/**
 * 
 */
package hackerrank;

import java.util.Scanner;

/**
 * @author Minal
 *
 */
public class Panagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		if(ispanagram(s)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		

		

	}

	/**
	 * @param s
	 * @return
	 */
	public static boolean ispanagram(String s) {
		// TODO Auto-generated method stub
		int[] checker=new int[256]; //65-90 97-122
		s=s.toLowerCase();
		System.out.println(s);
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			checker[ch]++;
		}
		
		for(int j=97;j<=122;j++){
		
				if(checker[j]==0){
					System.out.println(j+" "+checker[j]);
					return false;
				}
			
		}
		
		return true;
	}

}
