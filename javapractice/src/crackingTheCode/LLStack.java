/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class LLStack {
	private LLStackNode head;
	public LLStack(){
		head=new LLStackNode(null);
	}

	public void push(Object o){
		LLStackNode temp=new LLStackNode(o);
		LLStackNode cursor=head;
		while(cursor.getNext()!=null){
			cursor=cursor.getNext();
			
		}
		cursor.setNext(temp);
	}
	
}
