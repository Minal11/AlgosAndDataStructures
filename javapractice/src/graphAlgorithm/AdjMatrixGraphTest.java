/**
 * 
 */
package graphAlgorithm;

/**
 * @author Minal
 *
 */
public class AdjMatrixGraphTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdjMatrixGraph graph=new AdjMatrixGraph(4);
		graph.display();
		graph.addEdge(0, 1);
		graph.addEdge(0, 3);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		System.out.println();
		graph.display();
		

	}

}
