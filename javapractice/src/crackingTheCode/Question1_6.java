/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question1_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m={{1,2,3},
					{4,5,6},
					{7,8,9}};
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
					System.out.print(m[i][j]+" ");
			}
			System.out.println(" ");
		}
		int n=2;
		for(int i=0;i<n/2;i++){
			for(int j=0;j<n/2;j++){
				int temp=m[i][j];
				m[i][j]=m[i+1][j];
				m[i+1][j]=m[i+1][j+1];
				m[i+1][j+1]=m[i][j+1];
				m[i][j+1]=temp;
			}
		}
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
					System.out.print(m[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
