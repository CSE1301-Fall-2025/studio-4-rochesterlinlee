package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		double x = .5;
		double y = .5;
		double halfWidth = .5;
		double halfHeight = .25;
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle( x,  y,  halfWidth,  halfHeight);
	}
}