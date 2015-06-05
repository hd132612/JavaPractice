package org.dimigo.oop;

import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int kor, math, eng;
		System.out.println("국어 점수 입력 => ");
		kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		eng = scanner.nextInt();
		
		StringBuilder stringbuilder = new StringBuilder();
		stringbuilder.append("<< 점수 출력 >> \n");
		stringbuilder.append("국어 점수 : ");
		stringbuilder.append(kor);
		stringbuilder.append("수학 점수 : ");
		stringbuilder.append(math);
		stringbuilder.append("영어 점수 : ");
		stringbuilder.append(eng);
		stringbuilder.append("총점 : ");
		stringbuilder.append(kor+math+eng);
		stringbuilder.append("평균 : ");
		stringbuilder.append(String.format("%.1f",(double)(kor+math+eng)/3));
		
		System.out.print(stringbuilder);
		
	}

}
