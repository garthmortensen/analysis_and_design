import java.util.Date;
import java.util.Vector;

public class Order {
	Date date; // no private or public?
	Customer customer; // no private or public?
	private Int status;
	private Vector<Item> items = new Vector<Item>();
	
	public Order() { // no attributes set for instantiation?
	}
	public void Cancel() {
	}
	public static void Process() {
	}
	public void createItem(String itemName, double price, int qty) {
		Item item = new Item(itemName, price, qty);
	}
	public static void UpdateItem() {
	}
	public static void DeleteItem() {
	}
}