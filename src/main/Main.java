package main;
//1.1.2 Creation of main class for tests
//1.2.3 Creation of the tablea account

import java.util.Comparator;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import components.Account;
import components.Client;
import components.CurrentAccount;
import components.SavingsAccount;

public class Main 
{	
	public static void main(String[] args) 
	{
		Client[] clients = setClients(10);
		getClients(clients);
		Account[] accounts = setAccount(clients);
		getAccounts(accounts);
		Hashtable<Integer, Account> account_table = setHasTableAccounts(accounts);
		getHasTableAccountsByOrderAsc(account_table);
	}
	
	public static Client[] setClients (int number) 
	{
		Client[] clients = new Client[number];
		
		for (int i = 0; i < number; i++)
		{
			clients[i] = new Client("name" + (i + 1), "firstname" + (i + 1));
		}
		
		return clients;
	}
	
	public static void getClients(Client[] clients) 
	{	
		for (Client client : clients) 
		{
			System.out.println(client.toString());
		}
	}
	
	public static Account[] setAccount(Client[] clients) 
	{
		Account[] accounts = new Account[clients.length * 2];
		
		int i = 0;
		
		for (Client client : clients)
		{	
			accounts[i] = new SavingsAccount(client);
			i++;
			accounts[i] = new CurrentAccount(client);
			i++;
			
		}
		
		return accounts;
		
	}
	
	public static void getAccounts(Account[] accounts) 
	{	
		for (Account account : accounts) 
		{
			//System.out.println(account.toString());
		}
	}
	
	public static Hashtable<Integer, Account> setHasTableAccounts(Account[] accounts)
	{
		Hashtable<Integer, Account> hashtable = new Hashtable<>();
		
		for (Account account : accounts)
		{
			hashtable.put(account.getAccount_number(), account);
		}
		
		return hashtable;
	}
	
	public static void getHasTableAccountsByOrderAsc(Hashtable<Integer, Account> hashtable)
	{
		hashtable.entrySet().stream().sorted().forEach(System.out :: println);
	}
}
	