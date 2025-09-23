package Exceptions;

public class Account {
	String accType;
	String accNum;
	double bal;
	
	public Account(String accType, String accNum, double bal) {
		super();
		this.accType = accType;
		this.accNum = accNum;
		this.bal = bal;
	}
	public void getAccDetails() {
		System.out.println("Account Details:"+accType+" "+accNum+" "+bal);
	}
	public void calSI(int time,int ir) throws NegativeBalanceException {
		if(bal<0) {
			throw new NegativeBalanceException("Low Balance");
		}
		else {
		double si = (bal*time*ir)/100;
		System.out.println("The interest earned "+si);
		}
	}

}
