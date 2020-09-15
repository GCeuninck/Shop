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
	
	/*
	@Override
	public String toString() {
		return String.format("%s", this);
	}*/

}
