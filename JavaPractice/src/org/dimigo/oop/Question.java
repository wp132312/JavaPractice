/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop.Question
 *
 * 1. Scheme 	:  문제 3문제 내고 맞추기.
 * 2. Date 		: 2015. 5. 12.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String answer;
		
		System.out.println("가장 좋아하는 음악가는?");
		answer = scanner.nextLine();
		if(answer != null && answer.equals("리스트")) {
			System.out.println("정답입니다!! ^^\n");
		} else {
			System.out.println("틀렸습니다!! ㅠ\n");
		}
		
		System.out.println("가장 좋아하는 과목은?");
		answer = scanner.nextLine();
		if(answer != null && answer.equals("체육")) {
			System.out.println("정답입니다!! ^^\n");
		} else {
			System.out.println("틀렸습니다!! ㅠ\n");
		}
		
		System.out.println("가장 좋아하는 음악은?");
		answer = scanner.nextLine();
		if(answer != null && answer.equals("라 캄파넬라")) {
			System.out.println("정답입니다!! ^^\n");
		} else {
			System.out.println("틀렸습니다!! ㅠ\n");
		}
		
		scanner.close();
	}

}
