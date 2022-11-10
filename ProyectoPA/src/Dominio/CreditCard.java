package Dominio;

import java.text.SimpleDateFormat;

public class CreditCard {
	private int cardNumber;
	private SimpleDateFormat expirationDate;
	private int securityCode;
	private String customerNameCard;
	private int balance;
	
	public CreditCard(int cardNumber, SimpleDateFormat expirationDate, int securityCode, String customerNameCard) {
		this.cardNumber = cardNumber;
		this.expirationDate = expirationDate;
		this.securityCode = securityCode;
		this.customerNameCard = customerNameCard;
	}

	public int getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}

	public SimpleDateFormat getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(SimpleDateFormat expirationDate) {
		this.expirationDate = expirationDate;
	}

	public int getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(int securityCode) {
		this.securityCode = securityCode;
	}

	public String getCustomerNameCard() {
		return customerNameCard;
	}

	public void setCustomerNameCard(String customerNameCard) {
		this.customerNameCard = customerNameCard;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
}
