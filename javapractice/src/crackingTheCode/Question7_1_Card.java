/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question7_1_Card {
	public enum Suit{
		CLUBS (1),SPADES (2),HEARTS (3),DAIMONDS (4);
		int value;
		private Suit(int v){
			value=v;
		}
		
	};
	private int card;
	private int suit;
	/**
	 * 
	 */
	public Question7_1_Card(int r,int s) {
		// TODO Auto-generated constructor stub
		card=r;
		suit=s;
	}
	
	public int value(){
		return card;
	}
	public int suit(){
		return suit;
	}

}
