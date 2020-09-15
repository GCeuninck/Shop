package shopping;
import java.util.*;

public class Cart {

	List<CartItem> cart;
	
	Cart(){
		this.cart = new ArrayList<>();
	}

	public void clear() {
		this.cart.clear();
	}
	
	public void add(CartItem item) {
		this.cart.add(item);
	}
	
	public void remove(CartItem item) {
		this.cart.remove(item);
	}
	
	public int quantity(Product p) {
		
		int total = 0;
		
		for (CartItem item : this.cart) {
			if (item.getProduct().equals(p)) {
				total += item.getQuantity();
			}
		}
		return total;
	}
	
	public List<CartItem> priceGreater(int amount){
		
		List<CartItem> res = new ArrayList<>();
		for (CartItem item : this.cart) {
			if (item.price() > amount) {
				res.add(item);
			}
		}
		return res;
	}
	
	public int total() {
		int total = 0;
		
		for (CartItem item : this.cart) {
			total += item.price();
		}
		return total;
	}
	
	
	@Override
	public String toString() {
		
		String res = new String();
		
		res += "----------------------------------------------------------------\n";
		
		for (CartItem item : this.cart) {
			res += item.toString();
		}
		
		res += "----------------------------------------------------------------\n";
		res += "                  TOTAL:\t   ";
		
		int total = this.total();
		int euros = total/100;
		int centimes = total - euros * 100;
		
		res += String.format("%2d", euros) + "." + String.format("%02d", centimes) + "e";
		
		return res;
	}
	
	public static void main(String[] args) {
		
		//Cart cart = new Cart();
	}
}