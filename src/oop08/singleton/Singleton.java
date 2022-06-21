package oop08.singleton;

public class Singleton {
	//최초 한번요청으로 static에 올라가서 부를 때마다 메모리 낭비가 없다.
	private static Singleton singleton = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
}
