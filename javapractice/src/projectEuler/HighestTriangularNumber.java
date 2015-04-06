/**
 * 
 */
package projectEuler;

import java.util.HashSet;

/**
 * @author Minal
 *
 */
public class HighestTriangularNumber {
	static HashSet<Integer> factors=new HashSet<Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculateTriangularNumber();
		calculatefactors(10);
		System.out.println(factors.size());
		
	}
	/**
	 * 
	 */
	public static void calculateTriangularNumber() {
		// TODO Auto-generated method stub
		int i;
		while(true){
			
		}
		
	}
	//how to calculate factors of number
	public static HashSet calculatefactors(int number){
		
		for(int i=1;i<=number;i++){
			for(int j=1;j<=number;j++){
				if(i*j==number){
					if(!factors.contains(i)){
						factors.add(i);
					}
					if(!factors.contains(j)){
						factors.add(j);
					}
				}
				if(i*j>number){
					break;
				}
			}
		}
		return null;
		
	}

}
