package shopping;

public class ReducedPriceItem extends CartItem {

	float priceFactor;
	
	ReducedPriceItem(Product product, int quantity, float priceFactor) {
		super(product, quantity);
		this.priceFactor = priceFactor;
	}

	@Override
	int price() {
		return (int) (this.getQuantity()*this.unitPrice() - this.unitPrice()*(this.priceFactor/100));
	}

	/*
	@Override
	public String toString() {
		return String.format("%s", this);
	}*/
}
