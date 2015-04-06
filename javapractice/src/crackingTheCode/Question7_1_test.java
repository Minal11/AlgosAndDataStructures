/**
 * 
 */
package crackingTheCode;

/**
 * @author Minal
 *
 */
public class Question7_1_test {
	public static void main(String[] args){

		Question7_1_Card c= new Question7_1_Card(1, 3);
		System.out.println("the card value "+c.value()+" and suit is"+c.suit());
		c=new Question7_1_BlackjackCard(1,3);
		System.out.println("the card value "+c.value()+" and suit is "+ Question7_1_Card.Suit.values()[c.suit()]);
	}
	
	
}
