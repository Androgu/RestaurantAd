package models;

public class Product {

	// / Attributes

	private int quantity;
	private String name;
	private String brand; // Marca
	private double price; // Precio

	// / Constructor
	public Product(String name, String brand, double price, int quantity) {
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	// / Methods - Setters - getters
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
