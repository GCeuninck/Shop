package shopping;

public class DegressiveItem extends CartItem {
	
	int thresholdQuantity;
	int reducedUnitPrice;

	DegressiveItem(Product product, int quantity, int thresholdQuantity, int reducedUnitPrice) {
		super(product, quantity);
		this.thresholdQuantity = thresholdQuantity;
		this.reducedUnitPrice = reducedUnitPrice;
	}

	@Override
	int price() {
		if (this.getQuantity() >= this.thresholdQuantity) {
			return this.getQuantity()*this.reducedUnitPrice;
		}
		else {
			return this.getQuantity()*this.unitPrice();
		}
	}
	
	@Override
	public String toString() {
		int euros_unit = this.unitPrice()/100;
		int centimes_unit = this.unitPrice() - euros_unit * 100;
		
		int euros = this.price()/100;
		int centimes = this.price() - euros * 100;
		
		return String.format("Degressive Item:%s  %d x%2d.%02de\t   %2d.%de\n", this.getProduct().description(), this.getQuantity(), euros_unit, centimes_unit, euros, centimes);
	}

}
