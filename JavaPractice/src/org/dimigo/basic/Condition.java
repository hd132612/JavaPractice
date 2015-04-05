package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		
		String cartype = "고속버스";
		int distance = 10;
		int passmoney;
		int extramoney = 0;
		int totalmoney = 0;
		switch (cartype) {
		case "고속버스":
			passmoney = 850;
			extramoney = ((distance-1)/10)*300;
			totalmoney = passmoney + extramoney;
		break;
		case "경차":
			passmoney = 300;
			extramoney = ((distance-1)/10)*200;
			totalmoney = passmoney + extramoney;
		break;
		case "그 외":
			passmoney = 600;
			extramoney = ((distance-1)/10)*200;
			totalmoney = passmoney + extramoney;
		break;
		default:
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + cartype);
		System.out.println("통행료 : " + totalmoney + "원");
	}

}
