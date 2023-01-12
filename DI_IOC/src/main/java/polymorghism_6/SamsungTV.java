package polymorghism_6;



public class SamsungTV implements TV   {
	
	public SamsungTV() {
		System.out.println("samsungTV 객체 생성");
	}
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리....");
	}
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직 처리....");
	}
	
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