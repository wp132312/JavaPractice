/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance.FigureTest
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 8. 17.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class FigureTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c = new Circle(5);
		Triangle t = new Triangle(10, 10, 5, 8);
		Rectangle r = new Rectangle(20, 20, 5, 8);
		
		System.out.println("원의 넓이 : "+String.format("%.1f", c.calcArea()));
		System.out.println("삼각형 넓이 : "+String.format("%.1f", t.calcArea()));
		System.out.println("사각형 넓이 : "+String.format("%.1f", r.calcArea()));
	}

}
