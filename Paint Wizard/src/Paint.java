
public class Paint {
	private String name;
	private int size;
	private double cost;
	private double pl;

	public double getPl() {
		return pl;
	}

	public void setPl(double pl) {
		this.pl = pl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public Paint(String name, int size, double cost, double pl) {
		super();
		this.name = name;
		this.size = size;
		this.cost = cost;
		this.pl = pl;
	}

}
