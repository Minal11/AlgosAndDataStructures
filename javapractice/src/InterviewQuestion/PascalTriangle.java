/**
 * 
 */
package InterviewQuestion;
import java.util.*;
/**
 * @author Minal
 *
 */
public class PascalTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); //Enter number of rows you the triangle
		int[][] matrix=new int[n][n];
		printMatrix(matrix,n);
		for(int i=0;i<n;i++){
			matrix[i][0]=1;
		}
		printMatrix(matrix, n);
		for(int i=0;i<n;i++){
			matrix[i][i]=1;
		}
		printMatrix(matrix, n);
		for(int i=2;i<n;i++){
			for(int j=1;j<i;j++){
				matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j];
			}
		}
		printMatrix(matrix,n);
		
	}
	
	public static void printMatrix(int[][] matrix, int n){
		System.out.println();
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
