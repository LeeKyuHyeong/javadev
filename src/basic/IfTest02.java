package basic;

import java.util.Scanner;

public class IfTest02 {

	public static void main(String[] args) {
		
		//score(if) 0 ~ 100 점수 입력 받아 등급
		
		Scanner sc = new Scanner(System.in);
		//Heap에 있는 Scanner 바로 사용할 수 없다 Stack에 new로 만든 객체를 이용하여 사용할 수 있음
		
		System.out.print("점수입력(0 ~ 100) : ");
		
		int score = sc.nextInt();
		
		/*
		 * if(score >= 90) System.out.println("A"); else if(score >= 80)
		 * System.out.println("B"); else if(score >= 70) System.out.println("C"); else
		 * if(score >= 60) System.out.println("D"); else System.out.println("F");
		 */
		
		System.out.println(score >= 90 ? "A" : score >= 80 ? "B" : score >= 70 ? "C" : score >= 60 ? "D" : "F");

		sc.close();
	}

}
