package oop02.static01;

public class Account {
	
	static int money1; //동시에 공유해서 쓴다 static 붙는순간 메모리에 올라간다 
	int money2;
	
	public Account(int money) {
		money1 += money;
		money2 += money;
	}
}
