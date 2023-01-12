package polymorghism_2;

//TV 구현 클래스
public class SamsungTV implements TV   {

	
	// PowerOn() 추상메소드의 실체 메소드
	@Override
	public void PowerOn() {
		System.out.println("SamsungTV--전원 켠다");
	}
	@Override
	public void PowerOff() {
		System.out.println("SamsungTV--전원 끈다");
	}
	@Override
	public void volumUp() {
		System.out.println("SamsungTV--소리 올린다");
	}
	@Override
	public void volumDown() {
		System.out.println("SamsungTV--소리 내린다.");
	}

}
