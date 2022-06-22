package oop11.api;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("년도를 입력 (ex : 2022) :");
		int year = sc.nextInt();

		System.out.print("월을 입력 (ex 6) : ");
		int month = sc.nextInt();

		drawCalendar(year, month);

		sc.close();
	}

	public static void drawCalendar(int year, int month) {

		Calendar cal = Calendar.getInstance();
		int sweek = 0; // 그 달의 첫번째 날의 요일(일 : 1)
		int eday = 0; // 마지막 날짜

		cal.set(year, month - 1, 1);
		sweek = cal.get(Calendar.DAY_OF_WEEK);
		eday = cal.getActualMaximum(Calendar.DATE);

		System.out.println(" " + year + "년 " + month + "월");
		System.out.println("  일 월 화 수 목 금 토");
		for (int i = 0; i < sweek; i++) {
			System.out.print("  ");
		}
		for (int j = 1, w = sweek; j <= eday; j++, w++) {
			System.out.print(j < 10 ? "  " + j : " " + j);
			if (w % 7 == 0) {
				System.out.println();
			}
		}

	}

}
