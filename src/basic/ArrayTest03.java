package basic;

public class ArrayTest03 {

	public static void main(String[] args) {

		int[][] score = {
				{100, 90, 80, 70},
				{ 90, 80, 70, 60},
				{ 80, 70, 60, 50}
		};
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
