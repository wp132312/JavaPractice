package org.dimigo.oop;

/**
 * org.dimigo.oop.CarTest
 *
 * 1. Scheme 	: Car 클래스 작동 테스트.
 * 2. Date 		: 2015. 4. 14.
 *
 * @author		: ryusim
 * @version		: 1.1
 */

public class CarTest {
	public static void main(String[] args) {
		
		Car3 hyun = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car3 kia = new Car3("기아자동차", "K7", "흰색", 246);
		Car3 sam = new Car3("삼성자동차", "SM7", "회색");
		
		/*
		Car2 hyun = new Car2("현대자동차", "제네시스", "검정색", 225, 50000000);
		Car2 kia = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
		Car2 sam = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
		*/
	/*
	 * Setter
	 * 
		hyun.setCompany("현대자동차");
		hyun.setModel("제네시스");
		hyun.setColor("검정색");
		hyun.setMaxSpeed(225);
		hyun.setPrice(50000000);
		
		kia.setCompany("기아자동차");
		kia.setModel("K7");
		kia.setColor("흰색");
		kia.setMaxSpeed(246);
		kia.setPrice(40000000);
		
		sam.setCompany("삼성자동차");
		sam.setModel("SM7");
		sam.setColor("회색");
		sam.setMaxSpeed(200);
		sam.setPrice(38000000);
 	*/
		
		System.out.println("<< 자동차 목록 >>");
		System.out.println("제조사명 : "+hyun.getCompany());
		System.out.println("모델명 : "+hyun.getModel());
		System.out.println("색상 : "+hyun.getColor());
		System.out.println("최대속도 : "+hyun.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", hyun.getPrice())+"원");
		System.out.println();
		
		System.out.println("제조사명 : "+kia.getCompany());
		System.out.println("모델명 : "+kia.getModel());
		System.out.println("색상 : "+kia.getColor());
		System.out.println("최대속도 : "+kia.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", kia.getPrice())+"원");
		System.out.println();
		
		System.out.println("제조사명 : "+sam.getCompany());
		System.out.println("모델명 : "+sam.getModel());
		System.out.println("색상 : "+sam.getColor());
		System.out.println("최대속도 : "+sam.getMaxSpeed()+"km");
		System.out.println("가격 : "+String.format("%,d", sam.getPrice())+"원");
	}
}
