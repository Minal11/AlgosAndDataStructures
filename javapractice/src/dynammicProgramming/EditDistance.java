/**
 * 
 */
package dynammicProgramming;

/**
 * @author Minal
 *
 */
public class EditDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="kitten";
		String b="sitting";
		
		int m=a.length()+1;
		int n=b.length()+1;
		
		int[][] mat=new int[m][n];
		for(int i=0;i<m;i++){
			mat[i][0]=i;
		}
		
		for(int j=0;j<n;j++){
			mat[0][j]=j;
		}
		
		for(int j=1;j<n;j++){
			for(int i=1;i<m;i++){
				if(a.charAt(i-1)==b.charAt(j-1)){
					mat[i][j]=mat[i-1][j-1];
				}
				else{
					int min=Math.min((mat[i-1][j]+1),(mat[i][j-1]+1));
					mat[i][j]=Math.min(min,(mat[i-1][j-1]+1));
				}
				}
			}
		
		printTable(mat);
		}
	
	public static void printTable(int[][] x){
		for(int [] y : x){
			for(int z: y){
				System.out.print(z + " ");
			}
			System.out.println();
		}
		int p=x.length-1;
		int q=x[0].length-1;
		System.out.println("Edit Distance is="+x[p][q]);
		
		//traverse(x,str);
		
	}

}
