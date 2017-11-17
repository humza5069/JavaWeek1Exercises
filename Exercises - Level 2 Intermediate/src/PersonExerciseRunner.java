import java.util.ArrayList;

public class PersonExerciseRunner {
	public static void main(String[] args) {
		PeopleManager pm = new PeopleManager();
		Person a = new Person("Humza",21, "Software Developer");
		Person b = new Person("Nnamdi", 24, "Database Administrator");
		Person c = new Person("John", 30, "Shop Keeper");
		Person d = new Person("Andy", 16, "Vet");
		pm.addPerson(a);
		pm.addPerson(b);
		pm.addPerson(c);
		pm.addPerson(d);
		Person foundPerson = pm.findPerson("Andy");
		System.out.println(foundPerson);;
	
	}
	
}