package shopping;

public class RegularItem extends CartItem {

	RegularItem(Product product, int quantity) {
		super(product, quantity);
	}

	@Override
	int price() {
		return this.getQuantity()*this.unitPrice();
	}
	
	/*
	@Override
	public String toString() {
		return String.format("%s", this);
	}*/
}
