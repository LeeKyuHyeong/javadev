package basic;

import java.util.Scanner;

public class OpTest07 {

	public static void main(String[] args) {
		int a = 3;
		System.out.println(a==1 ? "남자입니다." : a == 7 ? "여자입니다." : "에러입니다.");
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		
			System.out.print("숫자입력(-1 종료) : ");
			
			int num = sc.nextInt();
			
			System.out.println(num==1 ? "남자입니다." : num == 2 ? "여자입니다." : "에러입니다.");
			
			
		sc.close();
	}

}
