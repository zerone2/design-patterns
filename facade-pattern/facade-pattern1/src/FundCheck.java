public class FundCheck {

	private double moneyInAccount = 100.00;

	public double getMoneyInAccount() { return moneyInAccount; }

	public void decreaseMoneyInAccount(double moneyWithdrawn) {
		moneyInAccount -= moneyWithdrawn;
	}
	
	public void increaseMoneyInAccount(double moneyDeposited) { 
		moneyInAccount += moneyDeposited;
	}
	
	public boolean haveEnoughMoney(double moneyToWithdrawal) {
		
		if(moneyToWithdrawal > getMoneyInAccount()) {
			System.out.println("Error: You don't have enough money");
			System.out.println("Current Balance: " + getMoneyInAccount());
			return false;
		} else {
			decreaseMoneyInAccount(moneyToWithdrawal);
			System.out.println("Withdrawal Complete: Current Balance is " + getMoneyInAccount());
			return true;
		}
	}
	
	public void makeDeposit(double cashToDeposit) {
		increaseMoneyInAccount(cashToDeposit);
		System.out.println("Deposit Complete: Current Balance is " + getMoneyInAccount());
	}
}
