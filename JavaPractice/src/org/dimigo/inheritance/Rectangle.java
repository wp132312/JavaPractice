/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance.Rectangle
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 8. 17.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class Rectangle extends Figure {
	private int width;
	private int height;
	
	public Rectangle(int centerX, int centerY, int width, int height) {
		super(centerX, centerY);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(int width, int height) {
		this(0,0,width,height);
	}
	
	protected double calcArea() {
		return this.width*this.height;
	}
}
