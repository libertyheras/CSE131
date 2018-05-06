package lab4;

import sedgewick.*;
import cse131.ArgsProcessor;

public class BumpingBalls {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		// for debug purposes - changes the draw rate
		int wait = 10;

		// setup vars
		int bcount = 0;

		double radius = 0;
		double dist = 0;
		double xtmp = 0;
		double ytmp = 0;
		double xvel = 0;
		double yvel = 0;
		double xpos = 0;
		double ypos = 0;
		double velx = 0;
		double vely = 0;
		double xhold = 0;
		double yhold = 0;
		
		boolean chk = true;


		bcount = ap.nextInt("Number of balls?");
		
		radius = ap.nextDouble("Radius of the balls? (enter zero to remain at default)");
		if (radius == 0) {
			radius = .05;
		}
		
		double balls[][] = new double[bcount][4];


		// setup canvas for StdDraw
		StdDraw.setXscale(-1.0, 1.0);
		StdDraw.setYscale(-1.0, 1.0);

		// fill arrays
		for (int i = 0; i < bcount; i++) {
			for (int j = 0; j < 3; j++) {
				balls[i][j] = 0;
			}
		}

		for (int i = 0; i < bcount; i++) {
			xtmp = 1 - (Math.random() * 1.9);
			ytmp = 1 - (Math.random() * 1.9);
			xvel = Math.random() * .09;
			yvel = Math.random() * .09;

			balls[i][0] = xtmp;
			balls[i][1] = ytmp;
			balls[i][2] = xvel;
			balls[i][3] = yvel;

		}

		while(chk == true) {
			StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
			StdDraw.filledSquare(0, 0, 1.0);

			for (int k = 0; k < bcount; k++) {
				for (int l = 0; l < bcount; l++) {
					dist = Math.pow((Math.pow((balls[k][0] - balls[l][0]), 2) + Math.pow((balls[k][1] - balls[l][1]), 2)), .5);

					if (dist <= (2 * radius)) {
						xhold = balls[k][2];
						yhold = balls[k][3];

						balls[k][2] = balls[l][2];
						balls[k][3] = balls[l][3];

						balls[l][2] = xhold;
						balls[l][3] = yhold;

					}

				}
				xpos = balls[k][0];
				velx = balls[k][2];
				if (Math.abs(xpos + velx) > 1 - radius) {
					balls[k][2] = -1 * balls[k][2];
				}
				ypos = balls[k][1];
				vely = balls[k][3];
				if (Math.abs(ypos + vely) > 1 - radius) {
					balls[k][3] = -1 * balls[k][3];
				}

				balls[k][0] = balls[k][0] + balls[k][2];
				balls[k][1] = balls[k][1] + balls[k][3];

				StdDraw.setPenColor(StdDraw.BLUE);
				StdDraw.filledCircle(balls[k][0], balls[k][1], radius);

			}
			StdDraw.show(wait);

		} 

	}

}
