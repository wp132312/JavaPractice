/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop.PiggyBank
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 6. 16.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class PiggyBank {
	private static int balance = 0;
	
	public static void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
	}
	
	public static void printBalance() {
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
}
