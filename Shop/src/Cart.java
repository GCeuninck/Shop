import java.util.*;

public class Cart {

	Cart(){
		
	}


	public void clear() {
		
	}
	
	public void add(CartItem item) {
		
	}
	
	public void remove(CartItem item) {
		
	}
	
	public int quantityProduct(Product p) {
		int res = 0; 
		return res;
	}
	
	public List<CartItem> priceGreaterThan(int amount){
		List<CartItem> res = new ArrayList<>();
		return res;
	}
	
	@Override
	public String toString() {
		return String.format("%s", this);
	}
	
}