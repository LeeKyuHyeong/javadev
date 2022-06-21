package oop10.thread;

public class ThreadTest01 {
	public static void main(String[] args) throws InterruptedException {
		/* 
		 * 멀티 스레드 : 프로세스 내에서 수행 흐름이 여러 개
		 *		1. Thread 클래스 상속받는 방법
		 *			1) extends Thread
		 *			2) run() 메소드 재 정의(overriding)
		 *			3) Thread를 상속받은 클래스의 객체 생성 run()메소드를 가지고 있는 클래스의 객체 생성
		 *			4) 객체.start()로 Thread 생성
		 *		2. Runnable 인터페이스 구현
		 *			1) implements Runnable
		 *			2) run() 메소드 재 정의
		 *			3) Runnable 인터페이스를 구현한 객체를 인자로 전달
		 *			4) start() 메소드 호출
		 */
		run();
		
		for(int i = 1; i <= 5; i++) {
			Thread.sleep(1000);
			System.out.println("main : " + i);
		}
	}

	private static void run() {
		for(int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("run : " + i);
			}
		
	}
}
