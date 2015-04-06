/**
 * 
 */
package BitManipulation;
import java.util.*;
/**
 * @author Minal
 *
 */
public class DNASequense {

	/**DNA sequence has A C G T 4 nucloidre find if there is a repeated sequence in DNA
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s="AAAAACCCCCAAAAACCCCCCAAAAAGGGTT";
		// TODO Auto-generated method stub
		List<String> res=new ArrayList<String>();
		res=findRepeatedDNASequence(s);
		System.out.println(res);

	}
	
	public static List<String> findRepeatedDNASequence(String s){
		List<String> result=new ArrayList<String>();
		//4 chacter so 2 bits each to represent in binary format 10 letter sequence is 20 bit long
		
		if(s.length()<10)
			return null;
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		map.put('A', 0);
		map.put('C', 1);
		map.put('G', 2);
		map.put('T', 3);
		
		Set<Integer> temp=new HashSet<Integer>();
		Set<Integer> added=new HashSet<Integer>();
		
		int hash=0;
		for(int i=0;i<s.length();i++){
			System.out.println();
			if(i<9){
				hash=(hash<<2)+map.get(s.charAt(i));
				System.out.print(hash+" "+i+" ");
			}
			else{
				hash=(hash<<2)+map.get(s.charAt(i));
				System.out.print(hash+" "+i+" ");
				hash=hash&(1<<20)-1;
				System.out.println("20 bit ");
				System.out.print(hash+" ");
				
				if(temp.contains(hash)&&!added.contains(hash)){
					added.add(hash);
					result.add(s.substring(i-9, i+1));
					System.out.println("added in added");
					
				}
				else{
					temp.add(hash);
				}
			}
		}
				
		return result;
	}

}
