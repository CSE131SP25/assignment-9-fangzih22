package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	private double x, y;
	
	/**
	 * Creates a new Food at a random location
	 */
	public Food() {
		double margin = FOOD_SIZE;
	    this.x = margin + Math.random() * (1 - 2 * margin);
	    this.y = margin + Math.random() * (1 - 2 * margin);
	}
	
	/**
	 * Draws the Food
	 */
	public void draw() {
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledCircle(x, y, FOOD_SIZE);
	}
	public double getX() {return this.x;}
	public double getY() {return this.y;}
	public double getSize() { return FOOD_SIZE;}
	
}
