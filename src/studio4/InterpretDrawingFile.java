package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;
import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		
		double x = .5;
		double y = .5;
		double halfWidth = .8;
		double halfHeight = .4;
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle( x,  y,  halfWidth,  halfHeight);
		double radius = .15;
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledCircle(x, y, radius);
		double h = .5;
		double k = .25;
		double halflength = .1;
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledSquare(h, k, halflength);

		double l = .68;
		double m = .38;
		double r = .065;
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(l, m, r);

		double a = .7;
		double s = .54;
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(a, s, r);

		double f = .62;
		double g = .68;
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(f, g, r);

		double z = .46;
		double q = .71;
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(z, q, r);

		double w = .32;
		double e = .62;
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(w, e, r);

		double t = .29;
		double o = .48;
		StdDraw.setPenColor(Color.PINK);
		StdDraw.filledCircle(t, o, r);

		double p = .35;
		double u = .359;
		StdDraw.setPenColor(Color.MAGENTA);
		StdDraw.filledCircle(p, u, r);








	}
}
