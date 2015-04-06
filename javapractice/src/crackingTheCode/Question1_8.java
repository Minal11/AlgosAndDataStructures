/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question1_8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="apple";
		String s2="pleap";
		if(isRotation(s1,s2)){
			System.out.println("Yes, they are rotation of each other");
		}
		else{
			System.out.println("No, they are't ");
		}
	}
	
	public static boolean isRotation(String s1, String s2){
		return (
				(s1.length()==s2.length())
				&&
				((s1+s2).indexOf(s2)!=-1));
			
		}
	}


