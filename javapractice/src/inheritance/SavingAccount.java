/**
 * 
 */
package inheritance;

/**
 * @author Minal
 *
 */
public class SavingAccount extends BankAccount {

	//should ahve a rate
	public SavingAccount(double rate){
		interestRate=rate;
	}
	public void addInterest(){
		double interest=getBalance()*interestRate/100;
		deposit(interest);
	}
	private double interestRate;
}
