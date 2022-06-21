package oop06.inter01;

public class TVUser {
	public static void main(String[] args) {
		TV tv2 = new LgTV();
		if(tv2 instanceof LgTV) {
			LgTV tv = (LgTV) tv2;
			
			tv.turnOn();
			
			tv.channelUp();
			tv.channelUp();
			tv.channelUp();
			
			tv.soundUp();
			tv.soundUp();
			
			tv.soundDown();
			
			tv.turnOff();
		} else if(tv2 instanceof STV) {
			STV tv = (STV) tv2;
			tv.turnOn();
			
			tv.channelUp();
			tv.channelUp();
			tv.channelUp();
			
			tv.soundUp();
			tv.soundUp();
			
			tv.soundDown();
			
			tv.turnOff();
		}
		
		
	}
}
