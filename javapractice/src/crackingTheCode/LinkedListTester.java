/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class LinkedListTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createUnsortedList();
		createSortedlist();
	}
	/**
	 * 
	 */
	public static Node createSortedlist() {
		LinkedList list=new LinkedList();
		// TODO Auto-generated method stub
		list.insert(10);
		list.insert(20);
		list.insert(30);
		list.insert(40);
		list.insert(50);
		list.printList();
		Node head=list.getHead();
		return head;
		
		
	}
	
	public static Node createSortedlist(int a, int b, int c) {
		LinkedList list=new LinkedList();
		// TODO Auto-generated method stub
		list.insert(a);
		list.insert(b);
		list.insert(c);
		
		list.printList();
		Node head=list.getHead();
		return head;
		
		
	}
	public static Node createUnsortedList(){
		LinkedList list=new LinkedList();
		list.insert(10);
		list.insert(60);
		list.insert(30);
		list.insert(90);
		list.insert(90);
		list.insert(30);
		list.insert(50);
		list.insert(90);
		
		list.printList();
		Node head=list.getHead();
		return head;
		

	}

	
	public static Node createCircularList(int l, int[] array){
		LinkedList list=new LinkedList();
		for(int k=0;k<l;k++){
			list.insert(array[k]);
		}
		
		
		list.printList();
		Node head=list.getHead();
		Node temp=head;
		while(temp.getNext()!=null){
			temp=temp.getNext();
		}
		Node n=head;
		for(int k=0;k<2;k++){
			n=n.getNext();
		}
		temp.setNext(n);
		return head;
		

	}
}
