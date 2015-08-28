/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance.SmartPhoneTest
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 8. 28.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone i = new IPhone("IPhone 6", "애플", 700000);
		SmartPhone g = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(i.toString());
		i.turnOn();
		i.pay();
		i.useSpecialFunction();
		i.turnOff();
		
		System.out.println();
		
		System.out.println(g.toString());
		g.turnOn();
		g.pay();
		g.useSpecialFunction();
		g.turnOff();
	}
}
