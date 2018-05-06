package studio4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdAudio;
import sedgewick.StdDraw;
import sedgewick.StdIn;

public class Flag {

	public static void main(String[] args) {
		//
		// Add code for your studio below here.
		//
		ArgsProcessor.useStdInput("music");

		double j = 0.95;
		for (double i = 0.1; i < 0.95; i = i + .05) {
			StdDraw.clear();

			StdDraw.setPenColor(Color.BLUE);
			StdDraw.filledRectangle(0, 0.1, 1.2, 0.1);
			StdDraw.filledRectangle(0, 0.9, 1.2, 0.1);

			StdDraw.setPenRadius(0.03);
			StdDraw.line(0.5, 0.6, 0.65, .4);
			StdDraw.line(0.5, 0.6, 0.35, .4);
			StdDraw.line(0.65, 0.4, 0.35, .4);
			StdDraw.line(0.65, 0.53, 0.5, .33);
			StdDraw.line(0.5, 0.33, 0.35, .53);
			StdDraw.line(0.65, 0.53, 0.35, .53);

			StdDraw.setPenColor(Color.RED);
			StdDraw.text(0.5, 0.9, "Israel");

			StdDraw.text(i, j, "Israel");
			j = j - 0.05;
			StdDraw.show(100);
		}

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
				if (StdIn.isEmpty()) {
					a = new double[0];
				}

		}
	}

}
