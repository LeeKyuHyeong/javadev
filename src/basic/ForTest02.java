package basic;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		int sum = 0;
		
		/*
		 * for(int i = 1; i <= 10; i++) { sum += i; }
		 * System.out.println("1부터 10까지의 합 : " + sum);
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.printf("1에서 %d까지의 합 : %d", n, sum);
		
	}

}
