/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance.Figure
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 8. 17.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class Figure {
	private int centerX;
	private int centerY;
	
	public Figure(int centerX, int centerY) {
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea() {
		return 3.14;
	}
}
