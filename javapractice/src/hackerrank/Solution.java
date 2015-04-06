/**
 * 
 */
package hackerrank;

/**
 * @author Minal
 *
 */

class Solution {
	public static void main(String args[] ){
		int[] A={};
		int re=solution(A);
		System.out.println(re);
		
	}
    static int solution(int[] A) {
        int n = A.length;
        int i = n - 1;
        int result = -1;
        int k = 0, maximal = 0;
        while (i > 0 ) {
            if (A[i] == 1) {
                k = k + 1;
                if (k >= maximal) {
                    maximal = k;
                    result = i;
                    System.out.println(result+" result");
                }
            }
            else
                k = 0;
            i = i - 1;
        }
        System.out.println("i"+i+" "+k+" "+maximal);
        if (A[i] == 1 && k + 1 > maximal){
        	result = 0;
        	System.out.println("hey"+result);
        }
            
        return result;
    }
}