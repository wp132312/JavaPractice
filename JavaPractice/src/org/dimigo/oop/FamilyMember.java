/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop.FamilyMember
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 6. 16.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;
	
	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}
	
	public String getMemberName() {
		return this.memberName;
	}
	
	public static void printMemberCnt() {
		System.out.println("가족 총 인원수 : "+memberCnt+"명");
	}
}
