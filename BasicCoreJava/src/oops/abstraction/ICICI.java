package oops.abstraction;

public class ICICI implements RBI{
	public void internetBanking() {
		System.out.println("ICICI provides internet banking");
	}

	public void moneyTransfer() {
		System.out.println("ICICI provides monney transfer faccility");
	}

	public void loan() {
		System.out.println("ICICI provides Loan");
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
