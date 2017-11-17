
public class Paintrunner {
	public static void main(String[] args) {
		PaintList pc = new PaintList();
		Paint paint1 = new Paint("CheapoMax", 20, 19.99, 200);
		Paint paint2 = new Paint("AverageJoes", 15, 17.99, 165);
		Paint paint3 = new Paint("DuluxourousPaints", 10, 25, 200);
		pc.addPaint(paint1);
		pc.addPaint(paint2);
		pc.addPaint(paint3);
	}
}