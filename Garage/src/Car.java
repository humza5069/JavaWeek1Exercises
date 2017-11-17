
public class Car extends Vehicle {
	private int numberofdoors;
	private int cost = 300;

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getNumberofdoors() {
		return numberofdoors;
	}

	public void setNumberofdoors(int numberofdoors) {
		this.numberofdoors = numberofdoors;
	}

	public Car(String make, int numberofwheels, String colour, int id, int numberofseats, int price,
			int numberofdoors) {
		super(make, numberofwheels, colour, id, numberofseats, price);
		this.numberofdoors = numberofdoors;
	}

	@Override
	public String toString() {
		return "Car: ID Number: " + getId() + ", Make: " + getMake() + ", Colour:" + getColour() +", No. of wheels:" + getNumberofwheels() +  
				", No. of seats:"+ getNumberofseats() +", No. of doors:" + numberofdoors +", Price:" + getPrice();
	}

}
