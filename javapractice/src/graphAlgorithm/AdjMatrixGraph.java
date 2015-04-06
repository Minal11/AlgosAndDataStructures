/**
 * 
 */
package graphAlgorithm;

/**
 * @author Minal
 *
 */
public class AdjMatrixGraph {
	
	public static int vc=0;
	public static int adjMatrix[][];
	
	public AdjMatrixGraph(int vc){
		this.vc=vc;
		adjMatrix=new int[vc][vc];
	}
	
	public static void addEdge(int i, int j){
		if(i>=0 && i<vc && j>0 && j<vc){
			adjMatrix[i][j]=1;
			adjMatrix[j][i]=1;
		}
	}
	public static void removeEdge(int i, int j){
		if(i>=0 && i<vc && j>0 && j<vc){
			adjMatrix[i][j]=0;
			adjMatrix[j][i]=0;
		}
	}
	
	public static int isEdge(int i, int j){
		if(i>=0 && i<vc && j>0 && j<vc)
			return adjMatrix[i][j];		
		return 0;
	}
	
	public static void display(){
		for(int i=0;i<vc;i++){
			for(int j=0;j<vc;j++){
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
