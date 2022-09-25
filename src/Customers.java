import java.util.Vector;

public class Customers {
	private Customer company;
	private Customer person;
	public Vector <Customer> customer; // why public?

	public Customers() { // what is this?
	}

	// dont you want all private by default, and access via getters/setters?
	// private static void
	public void CreateCompany() {
		company = new Company(null, null);
	}

	public void CreatePerson() {
		person = new Person(null, null);
	}

	public void DeleteCompany() {
	}

	public void DeletePerson() {
	}
}