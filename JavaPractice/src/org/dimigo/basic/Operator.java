package org.dimigo.basic;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1=9, s2=10;
		double sh=5.8, ss;
		int p=9;
		double ph=5.4, ps;
		
		ss=(s1+s2)*sh/2;
		ps=p*ph;
		
		System.out.println("<<도형 넓이 비교>>");
		System.out.println("사다리꼴 넓이 : "+ss);
		System.out.println("평행사변형 넓이 : "+ps+"\n\n");
		
		if(ss>ps) System.out.println("사다리꼴이 평행사변형 보다 "+(ss-ps)+"더 큽니다.");
		else if(ss==ps) System.out.println("사다리꼴과 평행사변형의 넓이가 같습니다.");
		else if(ss<ps) System.out.println("평행사변형이 사다리꼴보다 "+(ps-ss)+"더 큽니다.");
	}
}
