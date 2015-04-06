/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question7_1_BlackjackCard extends Question7_1_Card {

	/**
	 * @param r
	 * @param s
	 */
	public Question7_1_BlackjackCard(int r, int s) {
		super(r, s);
		// TODO Auto-generated constructor stub
	}
	
	//overidding the value method as the rules of blackjack is different
	public int value(){
		int r=super.value();
		if(r==1) return 11;
		else if(r<10) return r;
		else
			return 10;
				
	}
	public boolean isAce(){
		return super.value()==1;
	}
	
}
