
public class Company extends Customer {
	private String name;
	private String regno;

	// why is Person missing all this functionality?
	// this is for instantiation?
	public Company(String name, String regno) {
		super();
		this.name = name;
		this.regno = regno;
	}
	// discuss getters/setters?
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	// Override?
	// toString! print(object)?
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Company [name=").append(name).append(", regno=").append(regno).append("]");
		return builder.toString();
	}	
}