/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Node {
	
	public Node(){
		data=0;
		next=null;
	}
	public Node(Object d){
		data=d;
		next=null;
	}
	
	public Object getData(){
		return data;
	}
	public void setData(Object d){
		this.data=d;
	}
	
	public Node getNext(){
		return next;
	}
	
	public void setNext(Node next){
		this.next=next;
	}
	
	private Object data;
	private Node next;

}
