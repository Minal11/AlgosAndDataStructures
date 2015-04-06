/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question2_3 {

	/** delete node  which have pointer to that node
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListTester t=new LinkedListTester();
		Node node=t.createSortedlist();
		Node current=node;
		for(int i=0;i<1;i++){
			current=current.getNext();
		}
		
		if(current.getNext()!=null){
			current.setData(current.getNext().getData());
			current.setNext(current.getNext().getNext());
		}
				
		LinkedList.printList(node);
				
		
	}

}
