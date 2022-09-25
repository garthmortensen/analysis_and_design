
public class Item {

	// why private? bc instantiation and public void Update()? Just security?
	private double price;
	private double quantity;
	private String name;  // from Product attribute?
	public Product item;
	
	public Item(String itemName, double _price, double _quantity) {
		name = itemName;
		price = _price;
		quantity = _quantity;
	}
	public void Update(double _price, double _quantity) {
		price = _price;
		quantity = _quantity;
	}
}