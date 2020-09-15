package shopping;

public class BundledItem extends CartItem {

	int bundleSize;
	int paidQuantity;
	
	BundledItem(Product product, int quantity, int bundleSize, int paidQuantity) {
		super(product, quantity);
		this.bundleSize = bundleSize;
		this.paidQuantity = paidQuantity;
	}

	@Override
	int price() {
		return this.unitPrice() * ((this.getQuantity()/this.bundleSize) * this.paidQuantity + this.getQuantity()%this.bundleSize);
	}
	
	@Override
	public String toString() {
		int euros_unit = this.unitPrice()/100;
		int centimes_unit = this.unitPrice() - euros_unit * 100;
		
		int euros = this.price()/100;
		int centimes = this.price() - euros * 100;
		
		return String.format("Bundled Item:%s  %d x%2d.%02de\t   %2d.%de\n", this.getProduct().description(), this.getQuantity(), euros_unit, centimes_unit, euros, centimes);
	}
}
