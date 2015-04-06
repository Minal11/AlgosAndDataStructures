/**
 * 
 */
package crackingTheCode;

import java.util.Arrays;

/**
 * @author Minal
 *
 */
public class DynamicArrayStack {
	private static int top;
	private static int capacity;
	private static Object[] array;
	

	public DynamicArrayStack() {
		// TODO Auto-generated constructor stub
			// TODO Auto-generated constructor stub
		top=-1;
		capacity=30;
		array=new Object[capacity];
	}
	
	//push
	public void push(Object o){
		if(isFull()){
			increaseSize();
			array[++top]=o;
		}
				
	}
	
	//increaseSize
	public void increaseSize(){
		capacity=2*capacity;
		array=Arrays.copyOf(array,capacity);
	}
	
	//pop
	public Object pop(){
		if(isEmpty()){
			System.err.println("stack is empty");
		}
		else{
			Object elem=array[top--];
			return elem;
		}
		return -1;
	}
	
	
	//isEmpty
	public boolean isEmpty(){
		if(top==-1)
			return true;
		return false;
	}
	//isFull
	public boolean isFull(){
		if(top==capacity-1)
			return true;
		return false;
	}
	//peek
	public Object peek(){
		return array[top];
	}


}
