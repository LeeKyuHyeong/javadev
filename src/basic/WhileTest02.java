package basic;

public class WhileTest02 {

	public static void main(String[] args) {

		int n = 0, sum = 0;
		
		while(n <= 1000) {
			sum += n;
			n += 3;
		}
		System.out.println("1000까지 3의배수 합 : " + sum);
	}

}
