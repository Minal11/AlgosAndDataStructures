/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question1_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix={{1,2,3},
						{4,5,6},{7,0,8}};
		
		int[] row= new int[matrix.length];
		int[] column=new int[matrix[0].length];
		 
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=1;
					column[j]=1;
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				if(row[i]==1 || column[j]==1){
					matrix[i][j]=0;
					
				}
			}
		}
		
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}
