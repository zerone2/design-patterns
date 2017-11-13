public class BetFacade {
	private int age;
	AgeCheck ageChecker;
	FundCheck fundChecker;
	
	public BetFacade(int age){
		this.age = age;
		ageChecker = new AgeCheck();
		fundChecker = new FundCheck();
	}
	
	public int getAge() { return age; }
	
	public void placeBet(double inzet){
		if(ageChecker.isAgeValid(getAge()) &&
				fundChecker.haveEnoughMoney(inzet)) {
			System.out.println("placed your chips\n");
		} else {
			System.out.println("can't place your chips\n");
		}
	}
	
	public void withdrawMoney(double moneyToGet){
		if(fundChecker.haveEnoughMoney(moneyToGet)) {
			System.out.println("Transaction Complete\n");
		} else {
			System.out.println("Transaction Failed\n");
		}
	}

	public void depositMoney(double moneyToDeposit){
		fundChecker.makeDeposit(moneyToDeposit);
	}
}
