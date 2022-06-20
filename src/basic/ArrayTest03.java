package basic;

public class ArrayTest03 {

	public static void main(String[] args) {
		//배열은 객체다 arr.length쓰자
		int[][] score = {
				{100, 90, 80, 70},
				{ 90, 80, 70, 60},
				{ 80, 70, 60, 50}
		};
		
		System.out.println("\t\t[성적표]");
		System.out.println("================================================");
		System.out.println("국어\t영어\t수학\t철학\t총점\t평균");
		for (int i = 0; i < score.length; i++) {
			int sum = 0;
			double avg = 0.0;

			for (int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				avg = (double) (sum / score[i].length);
				System.out.print(score[i][j] + "\t");
			}
			System.out.print(sum + "\t" + avg);
			System.out.println();
		}
		System.out.println("================================================");
	}

}
