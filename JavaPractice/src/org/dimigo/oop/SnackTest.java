/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop.SnackTest
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 5. 19.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class SnackTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int price=0;
		
		Snack[] snack = {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		for(Snack s : snack) {
			s.printSnack();
			price += s.calcPrice();
			System.out.println();
		}
		
		System.out.println("총 구매 금액 : "+String.format("%,d",price)+"원");
	}

}
