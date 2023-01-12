package polymorghism_7;

public class SamsungTV implements TV   {
	
	private SonySpeaker speaker;
	
	
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
	// 외존성 주입(DI) 스프링 프레임워크에서는 객체를 빈으로 정의하고, 이를 
	//스프링 컨테이너에 등록하여 관리한다.
	// 스프링 컨테이너란
	// 의존성을 가지느 객체를 생성하고 관리하며 의존 관계를 연결해주는 객체
	// 설정파일(xml, yml등) 또는 자바 코드내에 @Configuration 어노테이션이 선언된
	//class나 @Bean 어노테이션에 적힌 메서드를 호출하여 반환된 객체를 컨데이너에
	// 등록하는 것을 스프링 빈이라고 한다.
	@Override
	// 의존성 주입(DI) = 객체가 다른 객체의 기능을  사용하는 것을 말한다.
	public void volumUp() {
		speaker = new SonySpeaker();
		speaker.volumeUp();
	}
	@Override
	public void volumDown() {
		speaker = new SonySpeaker();
		speaker.volumeDown();
	}

}
