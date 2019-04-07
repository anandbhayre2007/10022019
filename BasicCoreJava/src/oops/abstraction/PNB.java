package oops.abstraction;

public class PNB implements RBI{
	
	public void internetBanking() {
		System.out.println("PNB provides internet banking");
	}

	public void moneyTransfer() {
		System.out.println("PNB provides monney transfer faccility");
	}

	public void loan() {
		System.out.println("PNB provides Loan");
	}

	@Override
	public void demonetization() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loanRecovery() {
		// TODO Auto-generated method stub
		
	}

}
