package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] phones = {
				new iPhone("iPhone 6", "애플", 700000),
				new Galaxy("갤럭시 S6", "삼성", 650000)
		};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			
			// iPhone 또는 Galaxy폰 기능 사용하기
			phone.useSpecialFunction();
			
			phone.turnOff();
			System.out.println();
		}

	}

}
