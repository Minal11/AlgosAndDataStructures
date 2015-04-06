/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question1_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();
		if(method2("minam")){
			System.out.println("Its unique");
		}
		else{
			System.out.println("its not unique");
		}
	}
	//it will take n2 time
	public static void method1(){
		String str="abcdefghijklmnopqrstuvwxyz";
		
		for(int i=0;i<=str.length()/2;i++){
			for(int j=(str.length()/2)+1;j<str.length();j++){
				
				if(str.charAt(i)==str.charAt(j)){
					System.out.println("not unique");
					System.exit(1);
				}
				//System.out.println("exe");
			}
		}
		System.out.println("its unique");
	}

	//o(n) time
	public static boolean method2(String s){
		boolean[] char_set=new boolean[256]; //when you instantiate it is set to false
		for(int i=0;i<s.length();i++){
			int val=s.charAt(i);
			if(char_set[val]){
				return false;
			}
			else{
				char_set[val]=true;
			}
		}
			
		return true;
		
	}
	
}

