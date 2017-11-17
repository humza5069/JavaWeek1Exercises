

public class Map {

	int[][] map1 = new int[5][5];
	// {
	// map1[5][4] = 1;
	// map1[5][2] = 1;
	// player x = [0]
	// player y = [0]
	// }

	public void printMap() {

		for (int i = 0; i < map1.length; i++) {
			for (int j = 0; j < map1[i].length; j++) {
				System.out.print(map1[i][j]);
			}

			System.out.println();
		}

	}

	public void placePlayer(Player p) {
		map1[p.x][p.y] = 1;
	}

	public void choice(Player p, String decision) {
		switch (decision) {
		case "north":
			map1[p.x][p.y] = 0;
			p.x = p.x - 1;
			placePlayer(p);
			break;
		case "east":
			map1[p.x][p.y] = 0;
			p.y = p.y + 1;
			placePlayer(p);
			break;
		case "south":
			map1[p.x][p.y] = 0;
			p.x = p.x + 1;
			placePlayer(p);
			break;
		case "west":
			map1[p.x][p.y] = 0;
			p.y = p.y - 1;
			placePlayer(p);
			break;
		}
}
}