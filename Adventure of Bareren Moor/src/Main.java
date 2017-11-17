import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Map x = new Map();
		Player p = new Player(2, 3);
		x.placePlayer(p);
		x.printMap();

		Scanner sc = new Scanner(System.in);
		// String scanner=sc.nextLine();
		while (true) {
			System.out.println("Where would you like to go");
			String decision = sc.nextLine();
			x.choice(p, decision);
			x.printMap();
		//	if [x.map1] == [2][2]
					
		}
	}
}
