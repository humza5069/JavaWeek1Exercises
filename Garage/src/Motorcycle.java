
public class Motorcycle extends Vehicle {
	private int topspeed;
	private int cost = 100;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int topspeed() {
		return topspeed;
	}

	public void topspeed(int topspeed) {
		this.topspeed = topspeed;
	}

	public Motorcycle(String make, int numberofwheels, String colour, int id, int numberofseats, int price,
			int topspeed) {
		super(make, numberofwheels, colour, id, numberofseats, price);
		this.topspeed = topspeed;
	}

	
	public String toString() {
		return "Motorcycle: ID Number: " + getId() + ", Make: " + getMake() + ", Colour:" + getColour() +", No. of wheels:" + getNumberofwheels() +  
				", No. of seats:"+ getNumberofseats() +", Top Speed:" + topspeed() +", Price:" + getPrice();
	}

}
