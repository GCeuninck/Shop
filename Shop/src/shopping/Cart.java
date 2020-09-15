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
	
	@SuppressWarnings("unlikely-arg-type")
	public int quantityProduct(Product p) {
		return this.cart.get(this.cart.indexOf(p)).getQuantity();
	}
	
	public List<CartItem> priceGreater(int amount){
		
		return this.cart;
	}
	
	public int total() {
		return 0;
	}
	
	/*
	@Override
	public String toString() {
		return String.format("%s", this);
	}*/
	
	public static void main(String[] args) {
		
		System.out.println("");
	}
}