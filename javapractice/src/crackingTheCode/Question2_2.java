/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question2_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedListTester t=new LinkedListTester();
		Node head=t.createSortedlist();
		findnthNode(head,2);
		findnthNode1(head,3);

	}

	/**
	 * @param head
	 * @param i
	 */
	public static void findnthNode1(Node head, int n) {
		// TODO Auto-generated method stub
		if(head==null || n<1){
			System.out.println("sorry");
		}
		else{
			Node p1=head;
			Node p2=head;
			for(int i=0;i<n-1;i++){
				if(p2.getNext()==null){
					System.out.println("null");
					
				}
				else{
					p2=p2.getNext();
				}
				
			}
			
			while(p2.getNext()!=null){
				p1=p1.getNext();
				p2=p2.getNext();
			}
			System.out.println(p1.getData());
		}
		
		
		
		
	}

	/**
	 * @param head
	 */
	private static void findnthNode(Node head, int n) {
		// TODO Auto-generated method stub
		int s=LinkedList.getSize(head);
		Node current=head;
		for(int i=1;i<(s-n+1);i++){
			current=current.getNext();
		}
		System.out.println(current.getData());
	}

}
