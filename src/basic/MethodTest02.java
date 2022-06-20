package basic;

public class MethodTest02 {
	public static void main(String[] args) {
		
		print(10);
		print(2, 3);
		print(4, 5, 6);
		
	}

	private static void print(int... arr) { //가변인자
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
	
//	private static void print(int i, int j, int k) {
//	}
//
//	private static void print(int i, int j) {
//	}
//
//	private static void print(int i) {
//	}
}
