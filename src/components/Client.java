package components;
//1.1.1 Creation of the client class

public class Client {
	private String name;
	private String firstName;
	private int client_number;
	private static int number_absolute;

	public Client(String name, String firstName) {
		this.name = name;
		this.firstName = firstName;
		this.client_number = incrementClientNumber();
	}

	private static int incrementClientNumber() {
		return ++number_absolute;
	}

	@Override
	public String toString() {
		return "Client with name: " + name + " and first name: " + firstName + " and number: " + client_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getClient_number() {
		return client_number;
	}

	public void setClient_number(int client_number) {
		this.client_number = client_number;
	}
}
