/**
 * 
 */
package inheritance;

/**
 * @author Minal
 *
 */
public class AccountTester {
	public static void main(String[] args){
	
		SavingAccount momsAccount=new SavingAccount(2.0);
		momsAccount.deposit(10000);
		
		CheckingAccount kidAccount=new CheckingAccount(100);
		momsAccount.transfer(3000, kidAccount);
		kidAccount.withdraw(1000);
		kidAccount.withdraw(500);
		momsAccount.deposit(1000);
		kidAccount.withdraw(50);
		kidAccount.withdraw(1000);
		//end of month
		momsAccount.addInterest();
		kidAccount.deductFees();
		System.out.println("Mom's saving="+momsAccount.getBalance());
		System.out.println("Kid's saving="+kidAccount.getBalance());
		
		
	}

	
	
}
