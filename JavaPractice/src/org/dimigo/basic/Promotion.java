package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monavg=1700000, slaves=3, multies=1500;
		long result =(long) monavg*slaves*12*multies;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d", monavg)+"원");
		System.out.println("점포 내 직원 수 : "+slaves+"명");
		System.out.println("점포 수 : "+String.format("%,d", multies)+"개\n\n");
		System.out.println("연간 인건비 : "+String.format("%,d", result)+"원");
	}

}
