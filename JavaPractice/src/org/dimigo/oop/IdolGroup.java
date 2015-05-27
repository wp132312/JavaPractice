/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop.IdolGroup
 *
 * 1. Scheme 	: 아이돌 출력.
 * 2. Date 		: 2015. 5. 27.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class IdolGroup {
	public static void main(String[] args) {
			String[] idolGroup = {"빅뱅", "2NE1", "걸스데이"};
			
			String[][] members = {
				{"GD", "태양","대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유리", "소진", "민아", "혜리", "그외"}
			};
			
			for(int i=0; i<3; i++) {
				System.out.println("<< "+idolGroup[i]+" 멤버 >>");
				for(String val:members[i]) {
					System.out.println(val);
				}
				System.out.println();
			}
	}
}
