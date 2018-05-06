package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class WaitPoint {

	public static void main(String[] args) {
		// wait for the mouse to be pressed and released
		while (!StdDraw.mousePressed()) {
			StdDraw.pause(100);
		}
		// here, the mouse has been pressed
		while (!StdDraw.mousePressed()) {
			StdDraw.pause(100);
		}
		// here the mouse is released
		// draw a point at the location of the mouse
		StdDraw.setPenColor(Color.green);
		StdDraw.setPenRadius(.01);
		StdDraw.point(StdDraw.mouseX(), StdDraw.mouseY());

		// here, a q has been typed
		char key = ' ';
		while (key != 'q') {
			while (!StdDraw.hasNextKeyTyped()) {
				StdDraw.pause(100);
			}
			key = StdDraw.nextKeyTyped();

		}
		StdDraw.text(0.5, 0.5, "Farewell!");
	}

}
