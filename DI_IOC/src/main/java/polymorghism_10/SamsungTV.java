package polymorghism_10;

public class SamsungTV implements TV   {
	
	private Speaker speaker;
	private int price;
	
	
	public SamsungTV() {
		System.out.println("samsungTV(1) 객체 생성");
	}
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리....");
	}
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리....");
	}
	public SamsungTV(Speaker speaker) {
		System.out.println("samsungTV(2) 객체 생성");
		this.speaker = speaker; 
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("samsungTV(3) 객체 생성");
		this.speaker = speaker;
		this.price = price;
	}

	@Override
	public void PowerOn() {
		System.out.println("SamsungTV--전원 켠다 (가격 : " + price + ")");
	}



	@Override
	public void PowerOff() {
		System.out.println("SamsungTV--전원 끈다");
	}
	@Override
	// 의존성 주입(DI) = 객체가 다른 객체의 기능을  사용하는 것을 말한다.
	public void volumUp() {
		speaker.volumeUp();
	}
	@Override
	public void volumDown() {
		speaker.volumeDown();
	}

}
