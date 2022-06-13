package tests.factory;

import entities.Account;

//Classes do padr�o de projeto Factory s�o classes que instanciam objetos, caso seja uma opera��o repetitiva no sistema.
public class AccountFactory {
	
	public static Account createEmptyAccount() {
		return new Account(1L, 0.0);
	}
	
	public static Account createAccount(double initialBalance) {
		return new Account(1L, initialBalance);
	}
	
	
}
