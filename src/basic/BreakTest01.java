package basic;

public class BreakTest01 {

	public static void main(String[] args) {
		
		int sum =0;
		int i = 1;
		while(true) {
			sum += i;
			if(sum >= 100) break;		//속해있는 반복문만 빠져나감
			i++;
		}
		System.out.printf("1부터 %d 까지의 합계는 : %d", i, sum);

	}

}
