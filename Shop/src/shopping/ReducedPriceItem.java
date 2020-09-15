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

	@Override
	public String toString() {
		int euros_unit = this.unitPrice()/100;
		int centimes_unit = this.unitPrice() - euros_unit * 100;
		
		int euros = this.price()/100;
		int centimes = this.price() - euros * 100;
		
		return String.format("Reduced Item:%s  %d x%2d.%02de\t   %2d.%de\n", this.getProduct().description(), this.getQuantity(), euros_unit, centimes_unit, euros, centimes);
	}
}
