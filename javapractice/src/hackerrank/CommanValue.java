/**
 * 
 */
package hackerrank;

import java.util.Scanner;

/**
 * @author Minal
 *
 */
public class CommanValue {

	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
		int[] A={1,3,2,1};
		int[] B={4,2,5,3,2};
		int result=solution(A,B);
		System.out.println(result);
		System.err.println(Integer.MAX_VALUE);
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static int solution(int[] a, int[] b) {
		// TODO Auto-generated method stub
		int min=999;
	//	System.out.println(min+" jhdfgufdhh");
		int res=-1;
		int alength=a.length;
		int blength=b.length;
		if(alength>blength){
			
			for(int i=0;i<alength;i++){
				for(int j=0;j<blength;j++){
					if(a[i]==b[j]){
						if(a[i]<min){
							min=a[i];
						}
						
					}
				}
			}
		}else{
			for(int i=0;i<blength;i++){
				for(int j=0;j<alength;j++){
					if(b[i]==a[j]){
		//				System.out.println(min+" "+b[i]);
						if(b[i]<min){
							
							min=b[i];
							//System.out.println("min+"+min+" "+b[i]);
						}
						
					}
				}
			}
		}
		if(min==999){
			//System.out.println("min="+min);
			return -1;
		}
		return min;
	}

}
