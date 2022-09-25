import java.util.Vector;

public class Products {
	private Vector<Product> products;
	
	public void Create(String name, double price, int quantity) {
		Product product = new Product(name, price, quantity);
		products.add(product);
	}
	public void Delete(Product product) {
		products.remove(product);
	}
	public void Update() {
	}
	public void SelectBelowThreshold() {
	}
}