package polymorghism_4;

public class LgTV implements TV {
	
	public LgTV() {
		System.out.println("===> LGTV 객체 생성");
	}

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
