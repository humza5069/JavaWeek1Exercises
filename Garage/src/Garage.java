import java.util.ArrayList;

public class Garage {
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

	public void addVehicle(Vehicle p) {
		vehicleList.add(p);
	}

	public void removeVehicle(int theID) {
		for (Vehicle x : vehicleList) {
			if (x.getId() == theID) {	
	vehicleList.remove(x);
			}
		}

	}
	
	//public void cost() {
	//	for (int i = 0; i<vehicleList.size(); i++) {
	//	if (vehicleList.get(i) instanceof Car) {
		//System.out.println("Price to fix a Car is " + car.getCost());	
	//	}	
	//	if (vehicleList.get(i) instanceof Motorcycle) {
	//		System.out.println("Price to fix a Motorcycle is " + motorcycle.getCost());	
	//		}	
	//	if (vehicleList.get(i) instanceof Van) {
	//		System.out.println("Price to fix a Van is " + van.getCost());	
		//	}	
	//	}		
	//}
	
	Vehicle vehicle1 = new Vehicle(null, 0, null, 0, 0, 0);
	Car car = new Car(null, 0, null, 0, 0, 0, 0);
	Motorcycle motorcycle = new Motorcycle(null, 0, null, 0, 0, 0, 0);
	Van van = new Van(null, 0, null, 0, 0, 0, 0);
	
	public void printlist() {
		for (Vehicle i : vehicleList)
			System.out.println(i);
	}
	public Vehicle findVehicle(int idweneed) {
		Vehicle p = null;
	for(Vehicle currentVehicle: vehicleList) {
		if(currentVehicle.getId() == idweneed){
			p = currentVehicle;
			
			if (currentVehicle instanceof Car) {
				System.out.println("Price to fix a Car is " + car.getCost());
				}	
				if (currentVehicle instanceof Motorcycle) {
					System.out.println("Price to fix a Motorcycle is " + motorcycle.getCost());	
					}	
				if (currentVehicle instanceof Van) {
					System.out.println("Price to fix a Van is " + van.getCost());	
					}	
}
	}
	return p;
	}
}
