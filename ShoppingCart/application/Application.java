package application;

import products.Product;
import shoppingcart.ShoppingCart;

public class Application {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		Product product1 = new Product("A123", 100.0, "TV");
		// cart.action(product1, "add");
		cart.addProduct(product1);
		Product product2 = new Product("A665", 75.0, "MP3 Player");
		// cart.action(product2, "add");
		cart.addProduct(product2);
		Product product3 = new Product("A665", 75.0, "MP3 Player");
		// cart.action(product3, "add");
		cart.addProduct(product3);
		// cart.action(null, "print");
		cart.printProduct();
		// cart.action(product3, "remove");
		cart.removeProduct(product3);
		// cart.action(product3, "remove");
		cart.removeProduct(product3);
		// cart.action(null, "print");
		cart.printProduct();
	}

}
