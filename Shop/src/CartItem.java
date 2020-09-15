
public abstract class CartItem {

	int quantity;
	
	CartItem(int quantity) {
		this.quantity = quantity;
	}
	
	Product getProduct() {
		
	}
	
	int getQuantity() {
		return 0;
	}
	
	int unitPrice() {
		return 0;
	}
	
	@Override
	public String toString() {
		return String.format("%s", this);
	}
	
	boolean decreaseQty(int q) {
		return true;
	}
	
	boolean increaseQty(int q) {
		return true;
	}
	
	int price() {
		return 0;
	}
}
