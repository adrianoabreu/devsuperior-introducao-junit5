package tests.factory;

import entities.Account;

//Classes do padrão de projeto Factory são classes que instanciam objetos, caso seja uma operação repetitiva no sistema.
public class AccountFactory {
	
	public static Account createEmptyAccount() {
		return new Account(1L, 0.0);
	}
	
	public static Account createAccount(double initialBalance) {
		return new Account(1L, initialBalance);
	}
	
	
}
