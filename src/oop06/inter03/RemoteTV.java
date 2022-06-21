package oop06.inter03;

public abstract class RemoteTV implements RemoteControll {

	@Override
	public void powerOn() {
		System.out.println("RemoteTV 전원을 킵니다.");		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("RemoteTV 전원을 끕니다.");		

	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("RemoteTV 채널을 올립니다.");		

	}

//	@Override
//	public void channelDown() {
//		// TODO Auto-generated method stub
//
//	}

}
