/**
 * 
 */
package crackingTheCode;

import java.awt.peer.SystemTrayPeer;
import java.io.ObjectInputStream.GetField;

/**
 * @author Minal
 *
 */
public class Question2_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListTester t=new LinkedListTester();
		Node p1=t.createSortedlist(9, 6, 3);
		Node p2=t.createSortedlist(8, 4, 2);

		
		Node result=new Node(null);
		
		addList1(p1,p2,result);
		
		
		
	}
	private static int carry;
	/**
	 * @param p1
	 * @param p2
	 * @param result
	 */
	public static void addList1(Node p1, Node p2, Node result) {
		// TODO Auto-generated method stub
		if(p1==null){
			result=p2;
			return;
		}
		if(p2==null){
			result=p1;
			return;			
		}
		int size1=LinkedList.getSize(p1);
		int size2=LinkedList.getSize(p2);
		
		setCarry(0);
		if(size1==size2){
			result=addSameSize(p1,p2,getCarry());
		}
		Node new_head=null;
		System.out.println(getCarry()+" car");
		if(carry>0){
			new_head= LinkedList.insertbegining(carry, result);
		}
		LinkedList.printList(new_head);
		
	}

	/**
	 * @param p1
	 * @param p2
	 * @param carry
	 * @return
	 */
	public static Node addSameSize(Node p1, Node p2, int carry) {
		// TODO Auto-generated method stub
		
		if (p1== null)
	        return null;
	    int sum;
	    Node result=new Node(null);
	    result.setNext(addSameSize(p1.getNext(), p2.getNext(), getCarry())); 
	    // System.out.println(carry+"carry ");
	    sum = (int)p1.getData()+(int )p2.getData()+getCarry();
	    
	    
	    setCarry(sum);
	    sum = sum % 10;
	    System.out.println(sum+" sum");
	   
	    result.setData(sum);
	   
	    System.out.println(getCarry()+"lllll");
	   	 
	 
	    return result;
		
		
	}

	public static void setCarry(int sum) {
		//System.out.println(sum);
		carry=sum/10;
	//	System.out.println(carry);
	}
	public static int getCarry(){
		return carry;
	}
	
	

}
