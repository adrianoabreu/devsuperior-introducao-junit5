package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;
import tests.factory.AccountFactory;

//Classe que implementa testes com JUnit 5.
public class AccountTests {
	
	//Nomenclatura de um teste
	// <AÇÃO> should <EFEITO> [when <CENÁRIO>] 
	@Test
	public void depositShouldIncreaseBalanceAndDiscountFeeWhenPositiveAmount() {
		//Padrão AAA(Arrange, Act, Assert)
		
		//Arrange
		Double amount        = 200.00;
		Double expectedValue = 196.00;
		Account acc          = AccountFactory.createEmptyAccount();
		
		//Act
		acc.deposit(amount);
		
		//Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
	}
	
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		
		//Arrange
		Double expectedValue = 100.0;
		Account acc          = AccountFactory.createAccount(expectedValue);
		Double amount        = -200.00;
		
		//Act
		acc.deposit(amount);
		
		//Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
	public void fullWithdrawShouldClearBalanceAndReturnFullBalance() {
		Double expectedValue = 0.0;
		Double initialBalance = 800.00;
		Account acc = AccountFactory.createAccount(initialBalance);
		
		Double result = acc.fullWithdraw();
		
		Assertions.assertTrue(expectedValue == acc.getBalance());
		Assertions.assertTrue(result == initialBalance);
	}
	
}
