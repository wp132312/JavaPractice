package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int distance=25, fee = 0;
		String viechle="고속버스";
		
		System.out.println("<<고속도로 통행료 계산>>");
		
		switch(viechle) {
			case "고속버스":
				fee = 850;
				fee += (int)(distance/10)*300;
				if(distance%10==0) fee -= 300;
				break;
				
			case "경차":
				fee = 300;
				fee += (int)(distance/10)*200;
				if(distance%10==0) fee -= 200;
				break;
			
			default:
				fee=600;
				fee+=(int)(distance/10)*200;
				if(distance%10==0) fee -= 200;
				break;
		}
		
		System.out.println("거리 : "+distance+"km");
		System.out.println("차종 : "+viechle);
		System.out.println("통행료 : "+fee+"원");
	}

}
