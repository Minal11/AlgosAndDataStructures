/**
 * 
 */
package karamanchi;

/**
 * @author Minal
 *
 */
public class FirstRepeatingElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar=new int[]{1,3,4,5,2,2,2,1,3,4,5,0,0,2,0};
		int[] check=new int[ar.length];
		
		int x=0;
		for(int i=0;i<ar.length;i++){
			x=x^ar[i];
		}
		System.out.println(x);
	}

}
