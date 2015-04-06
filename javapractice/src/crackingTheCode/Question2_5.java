/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question2_5 {

	/** to detect loop in linkedlist
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int[] array={1,2,3,4,5,6,7};
		Node head=LinkedListTester.createCircularList(n, array);
		findloop(head);
		
	//	LinkedList.printList(head);
		
	}

	/**
	 * @param head
	 */
	public static void findloop(Node head) {
		// TODO Auto-generated method stub
		
		Node ptr1=head;
		Node ptr2=head;
		
		do{
			System.out.println(ptr1.getData()+ "  " +ptr2.getData());
			ptr1=ptr1.getNext();
			ptr2=ptr2.getNext().getNext();
		}while(ptr1.getData()!=ptr2.getData());
		System.out.println("loop detected"+ ptr1.getData()+ " and "+ptr2.getData());
		
		ptr1=head;
		while(ptr1.getData()!=ptr2.getData()){
			ptr1=ptr1.getNext();
			ptr2=ptr2.getNext();
		}
		
		System.out.println("First node "+ptr1.getData());
		
	}

}
