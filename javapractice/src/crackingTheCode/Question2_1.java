/**
 * 
 */
package crackingTheCode;

import java.util.Hashtable;

/**
 * @author Minal
 *
 */
public class Question2_1 {
	
	//remove duplicate from unsorted linkedlist
	public static void main(String[] args){
		LinkedListTester unsort=new LinkedListTester();
		 Node head=unsort.createUnsortedList();
		removeDuplicate(head);
		 Node head1=unsort.createUnsortedList();
		removeDuplicate1(head1);
		
	}

	/**
	 * @param head
	 */
	private static void removeDuplicate1(Node head) {
		//LinkedList.printList(head);
		// TODO Auto-generated method stub
		Node h=head;
		Node temp=head;
		Node ptr1=head;
		Node ptr2=ptr1.getNext();
		
		while(ptr1!=null && ptr1.getNext()!=null){
			System.out.print(ptr1.getData()+"=");
			while(ptr2!=null){
				
				if(ptr2.getData()==ptr1.getData()){
					
					ptr2.setNext(ptr2.getNext());
				
				}
				System.out.print(ptr2.getData()+"-");
				ptr2=ptr2.getNext();
				
			}
			System.out.println();
			System.out.println("list");
			LinkedList.printList(h);
			ptr1=ptr1.getNext();
			ptr2=ptr1.getNext();
			
		}
		System.out.println("hi");
		LinkedList.printList(h);	
		
	}

	/**
	 * 
	 */
	private static void removeDuplicate(Node n) {
		// TODO Auto-generated method stub
		Node h=n;
		Node previous=null;
		Hashtable table= new Hashtable();
		while (n != null) {
			if (table.containsKey(n.getData())){
				previous.setNext(n.getNext());
			}
			 else {
				 table.put(n.getData(), true);
				 previous = n;
			}
			 n = n.getNext();
			 }
		
		LinkedList.printList(h);
	}
	
	

}
