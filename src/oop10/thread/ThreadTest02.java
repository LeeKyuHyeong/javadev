package oop10.thread;

public class ThreadTest02 extends Thread {

	public static void main(String[] args) {
		ThreadTest02 thread = new ThreadTest02();
		thread.start();

		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("main : " + i);
		}
	}

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
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
