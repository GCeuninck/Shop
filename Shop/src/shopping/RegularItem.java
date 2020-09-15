package shopping;

public class RegularItem extends CartItem {

	RegularItem(Product product, int quantity) {
		super(product, quantity);
	}

	@Override
	int price() {
		return this.getQuantity()*this.unitPrice();
	}
	
	@Override
	public String toString() {
		int euros_unit = this.unitPrice()/100;
		int centimes_unit = this.unitPrice() - euros_unit * 100;
		
		int euros = this.price()/100;
		int centimes = this.price() - euros * 100;
		
		return String.format("Regular Item:%s  %d x%2d.%02de\t   %2d.%de\n", this.getProduct().description(), this.getQuantity(), euros_unit, centimes_unit, euros, centimes);
	}
}
