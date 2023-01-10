package components;
//1.2.2 Creation of the CurrentAccount and SavingsAccount

public class SavingsAccount extends Account 
{

	public SavingsAccount(Client client) {
		super("Savings Account", 0d, client);
	}
	
}
