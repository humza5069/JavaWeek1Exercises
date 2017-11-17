
public class Van extends Vehicle {
	private int capacity;
	private int cost = 500;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Van(String make, int numberofwheels, String colour, int id, int numberofseats, int price, int capacity) {
		super(make, numberofwheels, colour, id, numberofseats, price);
		this.capacity = capacity;
	}
	public String toString() {
		return "Van: ID Number: " + getId() + ", Make: " + getMake() + ", Colour:" + getColour() +", No. of wheels:" + getNumberofwheels() +  
				", No. of seats:"+ getNumberofseats() +", Capacity:" + getCapacity() +", Price:" + getPrice();
	}
}
