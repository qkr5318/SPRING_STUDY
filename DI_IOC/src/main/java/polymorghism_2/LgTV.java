package polymorghism_2;

// TV 구현 클래스
public class LgTV implements TV {

	// PowerOn() 추상메소드의 실체 메소드
	@Override
	public void PowerOn() {
		System.out.println("LgTV---전원을 켭니다");
	}

	@Override
	public void PowerOff() {
		System.out.println("LgTV---전원을 끕니다");
		
	}

	@Override
	public void volumUp() {
		System.out.println("LgTV---소리를 올립니다");
		
	}

	@Override
	public void volumDown() {
		System.out.println("LgTV---소리를 내립니다");
		
	}

}
