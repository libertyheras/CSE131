package studio4;

import java.awt.Color;
import java.io.FileInputStream;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	public static void main(String[] args) {
		// Flag is Czech Republic
		double x[] = { 0, 0, .5 };
		double y[] = { 0, 1, .5 };

		StdDraw.setPenColor(Color.blue);
		StdDraw.filledPolygon(x, y);

		double x2[] = { 0, .5, 1, 1 };
		double y2[] = { 0, .5, .5, 0 };

		StdDraw.setPenColor(Color.red);
		StdDraw.filledPolygon(x2, y2);

		StdDraw.setPenColor(Color.green);

		StdDraw.text(.5, .9, "Czech Republic");

		for (double l = .1; l < .9; l = l + .1) {
			double h = 1 - l;
			if (h != 0) {
				StdDraw.pause(100);
				StdDraw.text(l, h, "Czech Republic");
			}

		}

		ArgsProcessor.useStdInput("music");
		// System.setIn(new FileInputStream("music/music"));
		// repeat as long as there are more integers to read in

		while (!StdIn.isEmpty()) {

			// read in the pitch, where 0 = Concert A (A4)
			int pitch = StdIn.readInt();

			// read in duration in seconds
			double duration = StdIn.readDouble();

			// build sine wave with desired frequency
			double hz = 440 * Math.pow(2, pitch / 12.0);
			int N = (int) (StdAudio.SAMPLE_RATE * duration);
			double[] a = new double[N + 1];
			for (int i = 0; i <= N; i++) {
				a[i] = Math.sin(2 * Math.PI * i * hz / StdAudio.SAMPLE_RATE);
			}

			// play it using standard audio
			StdAudio.play(a);

		}
	}

}
