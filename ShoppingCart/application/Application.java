package application;

import products.Product;
import shoppingcart.ShoppingCart;

public class Application {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product product1 = new Product("A123", 100.0, "TV");
		cart.addProduct(product1);
		Product product2 = new Product("A665", 75.0, "MP3 Player");
		cart.addProduct(product2);
		Product product3 = new Product("A665", 75.0, "MP3 Player");
		cart.addProduct(product3);
		cart.printProduct();
		cart.removeProduct(product3);
		cart.removeProduct(product3);
		cart.printProduct();
	}

}
