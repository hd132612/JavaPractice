package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		int avg = 1700000;
		int person = 3;
		int company = 1500;
		long money = avg;
		money *= 12;
		money *= person;
		money *= company;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " + String.format("%,d", avg) + "원" );
		System.out.println("점포 내 직원 수 : " + String.format("%,d", person) + "명");
		System.out.println("점포 수 : " + String.format("%,d", company) + "개");
		System.out.println("연간 인건비 : " + String.format("%,d", money) + "원");

	}

}
