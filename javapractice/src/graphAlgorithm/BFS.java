/**
 * 
 */
/**
 * 
 */
package graphAlgorithm;
import java.util.*;
/**
 * @author Minal
 *
 */
public class BFS {

	
	public static final int maxVer=20;
	public static Vertex vertexList[];
	public static int adjMatrix[][];
	public static int vc=0;
	public static Queue queue;
	
	/**
	 * @param args
	 */
	
	public BFS(){
		vertexList=new Vertex[maxVer];
		adjMatrix=new int[maxVer][maxVer];
		queue=new LinkedList<Integer>();	
	}
	
	public void addVertex(char lab){
		vertexList[vc++]=new Vertex(lab);
	}
	
	public void addEdge(int i, int j){
		
		if(i>=0 && i<vc && j>0 && j<vc){
			adjMatrix[i][j]=1;
			adjMatrix[j][i]=1;
		}
	}
	
	public void addEdge(char a, char b){
		Vertex p=new Vertex(a);
		Vertex q=new Vertex(b);
		int i=-1, j=-1;
		for(int x=0;x<vc;x++){
		
			
			if((vertexList[x].label)==(p.label))
				i=x;
			if((vertexList[x].label)==(q.label))
				j=x;
		}
	
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
	
	public static void displayMatrix(){
		for(int i=0;i<vc;i++){
			for(int j=0;j<vc;j++){
				System.out.print(adjMatrix[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void displayVertex(int v){
		System.out.print(vertexList[v].label+" ");
		
	}
	
	public static int getAdjUnvisitedVertex(int v){
		for(int i=0;i<vc;i++){
			if(adjMatrix[v][i]==1 && vertexList[i].visited==false)
				return i;
		}
		
		return -1;
	}
	
	public static void bfs(){
		//put the root or first node in stack
		vertexList[0].visited=true;
		displayVertex(0);
		queue.add(0);
		int v1,v2;
		while(!queue.isEmpty()){
			v1=(int) queue.remove();
			while((v2=getAdjUnvisitedVertex(v1))!=-1){
				vertexList[v2].visited=true;
				displayVertex(v2);
				queue.add(v2);
			}
		}
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  BFS d=new BFS();
	  d.addVertex('A');
	  d.addVertex('B');
	  d.addVertex('C');
	  d.addVertex('D');
	  d.addVertex('E');
	  d.addVertex('F');
	  d.addVertex('G');
	  d.addVertex('H');
	  
	  d.addEdge('A', 'B');
	  d.addEdge('B', 'C');
	  
	  d.addEdge('C', 'D');
	  d.addEdge('B', 'H');
	  d.addEdge('C', 'E');
	  d.addEdge('E', 'G');
	  d.addEdge('E', 'F');
	  d.addEdge('E', 'H');
	  
	  displayMatrix();
	  d.bfs();
	  
	  

	}

}

