package tests.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import entities.Account;

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
		Account acc          = new Account(1L, 0.0);
		
		//Act
		acc.deposit(amount);
		
		//Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
		
	}
	
	@Test
	public void depositShouldDoNothingWhenNegativeAmount() {
		
		//Arrange
		Double expectedValue = 100.0;
		Account acc          = new Account(1L, expectedValue);
		Double amount        = -200.00;
		
		//Act
		acc.deposit(amount);
		
		//Assert
		Assertions.assertEquals(expectedValue, acc.getBalance());
	}
	
}
