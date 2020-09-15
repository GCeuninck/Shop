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
	
	/*
	@Override
	public String toString() {
		return String.format("%s", this);
	}*/

}
