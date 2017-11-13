public class Client {

	public static void main(String[] args) {
		BetFacade facade = new BetFacade(22);
		facade.placeBet(50.00);
		facade.withdrawMoney(60.00);
	}
}
