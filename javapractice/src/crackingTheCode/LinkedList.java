/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class LinkedList {
	
	private static Node head;
	private static int size;
	
	LinkedList(){
		
		head=new Node(null);
		size=0;
	}
	
	//inserting at the end
	public static void insert(Object data){
		
		Node temp=new Node(data);
		if(isEmpty()){
			head=new Node();
			head.setNext(temp);
			head=temp;
			size++;
		}
		else{
			Node current=head;
			while(current.getNext()!=null){
				current=current.getNext();
			}
			current.setNext(temp);
			size++;
		}
		
	}
	
	public static void insert(Object data,int pos){
		int s=getSize();
		if(pos>s || pos<0){
			System.out.println("position out of rangge");
		}
		else{
			Node node=new Node(data);
			Node temp=head;
			for(int i=0;i<pos-2;i++){
				temp=temp.getNext();
			}
			node.setNext(temp.getNext());
			temp.setNext(node);
			
		}
		
		
	}
	public static Node insertbegining(Object data,Node head){
		Node node=new Node(data);
		if(head==null){
			head.setNext(node);
		}
		else{
			System.out.println(node.getData());
			node.setNext(head);
			
			head=node;
			
		}
		return head;
		
	}
	
	
	
	public static boolean isEmpty(){
		if(head.getData()==null){
			return true;
		}
		return false;
	}
	
	public static int getSize(){
		return size;
	}
	
	public static int getSize(Node head){
		int s=0;
		if(head.getData()==null){
			return 0;
		}
		else{
			Node current=head;
			while(current.getNext()!=null){
				current=current.getNext();
				s++;
			}
			s++;
		}
		
		
		return s;
		
	}
	
	public static void printList() {
	
		if(isEmpty()){
			System.out.println("List is empty");
		}
		else{
			Node temp=head;
			do{
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
			}while(temp!=null);
		}
		System.out.println();
	}
	
	public static void printList(Node h) {
		
		if(isEmpty()){
			System.out.println("List is empty");
		}
		else{
			Node temp=h;
			do{
				System.out.print(temp.getData()+" ");
				temp=temp.getNext();
			}while(temp!=null);
		}
		System.out.println();
	}
	
	public static Node getHead(){
		return head;
	}
	
}
