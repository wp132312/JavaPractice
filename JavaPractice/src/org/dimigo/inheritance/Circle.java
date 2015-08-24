/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance.Circle
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 8. 17.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class Circle extends Figure {
	private int radius;
	
	public Circle(int centerX, int centerY, int radius) {
		super(centerX, centerY);
		this.radius = radius;
	}
	
	public Circle(int radius) {
		this(0,0,radius);
	}
	
	protected double calcArea() {
		return this.radius*this.radius*Math.PI;
	}
}
