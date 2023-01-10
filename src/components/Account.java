package components;
//1.2.1 Creation of the account class

public abstract class Account 
{
	protected String label;
	protected double balance;
	protected int account_number;
	protected static int number_absolute;
	protected Client client;
	
	
	protected Account(String label, Double balance, Client client) {
		this.label = label;
		this.balance = balance;
		this.client = client;
		this.account_number = incrementAccountNumber();
	}

	private static int incrementAccountNumber() 
	{
		return ++number_absolute;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public int getAccount_number() {
		return account_number;
	}

	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}

	@Override
	public String toString() {
		return "Account with label: " + label + ", balance: " + balance + " and client: [" + client + "] it's number account is: " + account_number;
	}
}
