/**
 * 
 */
package inheritance;

/**
 * @author Minal
 *
 */
public class CheckingAccount extends BankAccount {
	public CheckingAccount(double initialbalance){
		super(initialbalance); //to invoke the constructor of superclass
		transactionCount=0;
	}
	public void deposit(double amount){
		transactionCount++;
		super.deposit(amount);
	}
	public void withdraw(double amount){
		transactionCount++;
		super.withdraw(amount);
	}
	public void deductFees(){
		if(transactionCount>FREE_TRANSACTION){
			double fees=TRANSACTION_FEE*(transactionCount-FREE_TRANSACTION);
			super.withdraw(fees);
		}
		transactionCount=0;
	}

	private int transactionCount;
	private static final double TRANSACTION_FEE=2.0;
	private static final int FREE_TRANSACTION=3;
	

}
