
public class Product {
	
	int unitPrice;
	String description;
	
	// constructeur canonique
	Product(int unitPrice, String description) {
		this.unitPrice = unitPrice;
		this.description = description;
	}
	
	// factory method (méthode de classe)
	public static Product newProduct(int unitPrice, String description) {
		return new Product(unitPrice, description);
	}
	
	public static void main(String[] args) {
		
		Product res = new Product(10, "test");
	}
}
