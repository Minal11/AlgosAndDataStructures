/**
 * 
 */
package graphAlgorithm;

import java.util.*;

import crackingTheCode.Node;
/**
 * @author Minal
 *
 */
public class AdjListGraph {
	
	public static ArrayList<Integer> vertices;
	public static Node[] edges;
	public static int vc=0;
	
	public AdjListGraph(int vc){
		this.vc=vc;
		vertices=new ArrayList<Integer>();
		edges=new Node[vc];
	
		for(int i=0;i<vc;i++){
			vertices.add(i);
			edges[i]=new Node(i);
		}
	}

	public static void addEdge(int s, int d){
		int i=vertices.indexOf(s);
		int j=vertices.indexOf(d);
		
		if(i!=-1 || j!=-1){
			Node t=edges[i];
			Node temp=new Node(d);
			
			while(t.getNext()!=null){
				t=t.getNext();
			}
			t.setNext(temp);
			
		}
	}
	
	public static void display(){
		for(int j=0;j<vc;j++){
			Node head=edges[j];
			while(head!=null){
				System.out.print(head.getData()+"->");
				head=head.getNext();
			}
			System.out.println();
			//System.out.println(head.getNext().getData());
		}
		
	}
	
}
