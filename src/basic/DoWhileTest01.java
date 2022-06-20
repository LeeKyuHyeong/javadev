package basic;

public class DoWhileTest01 {

	public static void main(String[] args) {

		int n = 0, sum = 0;
		
		do {
			sum += n;
			n += 3;
			
		} while(n <= 1000);
		
		
		System.out.println("1000까지 3의배수 합 : " + sum);
	}

}
