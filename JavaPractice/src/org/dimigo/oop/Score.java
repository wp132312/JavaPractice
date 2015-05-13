/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop.Score
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 5. 13.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		int kor, mat, eng;
		
		System.out.print("국어 점수 입력 =>");
		kor = sc.nextInt();
		System.out.print("수학 점수 입력 =>");
		mat = sc.nextInt();
		System.out.print("영어 점수 입력 =>");
		eng = sc.nextInt();
		
		System.out.println("\n");
		sb.append("<< 점수 출력 >>\n");
		sb.append("국어 점수:");
		sb.append(kor);
		sb.append("점\n");
		sb.append("수학 점수:");
		sb.append(mat);
		sb.append("점\n");
		sb.append("영어 점수:");
		sb.append(eng);
		sb.append("점\n");
		
		System.out.println(sb);
	}

}
