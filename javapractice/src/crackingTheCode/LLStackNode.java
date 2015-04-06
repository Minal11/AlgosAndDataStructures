/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class LLStackNode {
	private Object data;
	LLStackNode next;
	/**
	 * 
	 */
	public LLStackNode() {
		// TODO Auto-generated constructor stub
		data=null;
		next=null;
		
	}
	public LLStackNode(Object d) {
		// TODO Auto-generated constructor stub
		data=d;
		next=null;
		
	}
	public Object getData(){
		return data;
	}
	public void setData(Object d){
		this.data=d;
	}
	
	public LLStackNode getNext(){
		return next;
	}
	
	public void setNext(LLStackNode next){
		this.next=next;
	}
	
}
