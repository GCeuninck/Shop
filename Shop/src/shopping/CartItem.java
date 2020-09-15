package shopping;

public abstract class CartItem {

	int quantity;
	Product product;
	
	CartItem(Product product, int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	Product getProduct() {
		return this.product;
	}
	
	int getQuantity() {
		return this.quantity;
	}
	
	int unitPrice() {
		return this.getProduct().unitPrice;
	}
	
	boolean decreaseQty(int q) {
		if (this.quantity-q > 0) {
			this.quantity -= q;
		}
		return false;
	}
	
	void increaseQty(int q) {
		this.quantity += q;
	}
	
	abstract int price();
	
	@Override
	abstract public String toString();
}
