package exercises;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {

		Robot r = new Robot();

		r.penDown();

		r.setSpeed(10);

		int numberOfSides = 5;

		double angle = 360 / 5;

		for (int i = 0; i < 200; i++) {

			r.setRandomPenColor();

			r.move(i);

			r.turn(angle);

			r.turn(1);
		}
	}

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}