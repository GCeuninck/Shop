package shopping;

public class Product {
	
	int unitPrice;
	String description;
	
	// constructeur canonique
	Product(String description, int unitPrice) {
		this.description = description;
		this.unitPrice = unitPrice;
	}
	
	public int unitPrice() {
		return this.unitPrice;
	}
	
	public String description() {
		return this.description;
	}
}
