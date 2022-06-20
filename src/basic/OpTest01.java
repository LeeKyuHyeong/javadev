package basic;

import java.util.Scanner;

public class OpTest01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);				//System.in 콘솔(표준)입력, 키보드입력을 의미
		//System.out.print("숫자 두개를 입력하세요 : ");
		System.out.print("정수 a 값 : ");
		int a = sc.nextInt();
		
		System.out.print("정수 b 값 : ");
		int b = sc.nextInt();
		/*
		 * STACK		
		 * int a = 7;					할당
		 * 
		 * HEAP
		 * Scanner sc = new Scanner();	참조
		 */
		//int a = 7;
		//int b = 4;
		
		//System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.println(a + " + " + b + " = " + (a+b));
		System.out.println(a + " - " + b + " = " + (a-b));
		System.out.println(a + " X " + b + " = " + (a*b));
		System.out.println(a + " / " + b + " = " + (a/b));
		System.out.println(a + " % " + b + " = " + (a%b));
		
		sc.close();
		
	}

}
