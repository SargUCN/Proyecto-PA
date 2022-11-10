package Dominio;

import java.util.LinkedList;


public class Client extends Person {
	private int wallet;
	private CreditCard creditCard;
 	private LinkedList<Product> purchasedProducts;
	private LinkedList<Product> shoppingCart;
	
	public Client(String name, String lastName, String ruth, String password,String mail,boolean state) {
		super(name, lastName, ruth, password,mail,state);
		shoppingCart = new LinkedList<>();
		purchasedProducts = new LinkedList<>();
	}

	public int getWallet() {
		return wallet;
	}

	public void setWallet(int wallet) {
		this.wallet = wallet;
	}

	public LinkedList<Product> getPurchasedProducts() {
		return purchasedProducts;
	}


	public void setPurchasedProducts(LinkedList<Product> purchasedProducts) {
		this.purchasedProducts = purchasedProducts;
	}


	public LinkedList<Product> getShoppingCart() {
		return shoppingCart;
	}


	public void setShoppingCart(LinkedList<Product> shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	
	
}
