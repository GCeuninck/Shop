import java.util.*;

public class Cart {

	Cart(){
		
	}


	protected void clear() {
		
	}
	
	protected void add(CartItem item) {
		
	}
	
	protected void remove(CartItem item) {
		
	}
	
	protected int quantityProduct(Product p) {
		int res = 0; 
		return res;
	}
	
	protected List<CartItem> priceGreaterThan(int amount){
		final List<CartItem> res = new ArrayList<>();
		return res;
	}
	
	@Override
	public String toString() {
		return String.format("%s", this);
	}
	
}