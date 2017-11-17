
public class Vehicle {

	private String make;
	private int numberofwheels;
	private String colour;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNumberofwheels() {
		return numberofwheels;
	}

	public void setNumberofwheels(int numberofwheels) {
		this.numberofwheels = numberofwheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getNumberofseats() {
		return numberofseats;
	}

	public void setNumberofseats(int numberofseats) {
		this.numberofseats = numberofseats;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private int numberofseats;
	private int price;

	public Vehicle(String make, int numberofwheels, String colour, int id, int numberofseats, int price) {
		super();
		this.make = make;
		this.numberofwheels = numberofwheels;
		this.colour = colour;
		this.numberofseats = numberofseats;
		this.price = price;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Vehicle make=" + make + ", numberofwheels=" + numberofwheels + ", colour=" + colour + ", id=" + id
				+ ", numberofseats=" + numberofseats + ", price=" + price;
	}

	public static void main(String[] args) {

		Garage vm = new Garage();
		Vehicle car1 = new Car("Vauxhall", 4, "Grey", 01, 5, 2000, 5);
		Vehicle van1 = new Van("Nissan", 4, "White", 02, 3, 5000, 10);
		Vehicle motorcycle1 = new Motorcycle("Yamaha", 2, "Red", 03, 1, 3000, 200);
		vm.addVehicle(car1);
		vm.addVehicle(van1);
		vm.addVehicle(motorcycle1);
	//	vm.printlist();
	//	vm.cost();
		Vehicle foundcar = vm.findVehicle(3);
		System.out.println(foundcar);

	}

}