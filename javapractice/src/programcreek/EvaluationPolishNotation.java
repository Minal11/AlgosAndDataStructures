/**
 * 
 */
package programcreek;

import java.util.Stack;

/**
 * @author Minal
 *
 */
public class EvaluationPolishNotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str=new String[]{"2","3","+","3","*"};
		System.out.println("Evaluation of polish Notation "+eval(str));
		System.out.println("Evaluation of polish Notation "+eval1(str));
	}
	
	public static int eval(String[] str){
		String operators="+-*/";
		int val=0;
		Stack<String> st=new Stack<String>();
		
		for(String s:str){
			if(!operators.contains(s)){
				st.push(s);
			}
			else{
				int a=Integer.valueOf(st.pop());
				int b=Integer.valueOf(st.pop());
				switch(s){
				case "+":
					st.push(String.valueOf(a+b));
					break;
				case "-":
					st.push(String.valueOf(a-b));
					break;
				case "*":
					st.push(String.valueOf(a*b));
					break;
				case "/":
					if(a>b)
						st.push(String.valueOf(a/b));
					else
						st.push(String.valueOf(b/a));
					
					break;
				}
				
			}
		}
		val=Integer.valueOf(st.pop());
		return val;
		
	}
	
	public static int eval1(String[] str){
		String operators="+-*/";
		int val=0;
		Stack<String> st=new Stack<String>();
		
		for(String s:str){
			if(!operators.contains(s)){
				st.push(s);
			}
			else{
				int a=Integer.valueOf(st.pop());
				int b=Integer.valueOf(st.pop());
				int t=operators.indexOf(s);
				switch(t){
				case 0:
					st.push(String.valueOf(a+b));
					break;
				case 1:
					st.push(String.valueOf(a-b));
					break;
				case 2:
					st.push(String.valueOf(a*b));
					break;
				case 3:
					if(a>b)
						st.push(String.valueOf(a/b));
					else
						st.push(String.valueOf(b/a));
					
					break;
				}
				
			}
		}
		val=Integer.valueOf(st.pop());
		return val;
		
	}

}
