package oop06.inter01;

public class InkelSpeaker implements Speaker {

	@Override
	public void soundUp() {
		System.out.println("InkelSpeaker : 볼륨업");
	}

	@Override
	public void soundDown() {
		System.out.println("InkelSpeaker : 볼륨다운");
	}

}
