package oop07.anony;

public class Anonymous {
	// 한번만 객체를 만들면 되는 상황에서는 따로 Impl 자바파일 안만들고 바로 만들어주는 익명클래스
	// 주로 안드로이드 이벤트 처리나 스프링 JDBC에 사용
	
	RemoteControl rc = new RemoteControl() {
		
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");			
		}
	};
	
	public void method1() {
		RemoteControl rc = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("Audio를 켭니다.");				
			}
			
			@Override
			public void turnOff() {
				System.out.println("Audio를 끕니다.");				
			}
		};		
		rc.turnOn();
	}
	public void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
