package polymorghism_3;

// 유지보수를 용이하게 하기 위해 결합도(COUPLING)를 낮추기 위한 방법으로
// 이번에는 디자인 패턴(Factory 패턴)을 사용해 봅니다.
// 앞서, 다형성을 이용했던 방법은 메서드를 호출할때 인터페이스를 이용함으로써 좀더 쉽게 TV를 교체할수 있었지만
// 이 방법은 TV를 변경하고자 할 때, TV 클래스를 객체를 생성하는 소스를 수정해야만 합니다.
// 이번에는 TV를 교체할 때, 클라이언트 소스를 수정하지 않고, TV를 교체할 수 있도록 해봅니다.
// 이것을 위하여, Factory 패턴을 만들고, 클라이언트에서 사용할 객체 생성을 캡슐화하여
// TV User와 TV 사이를 느슨한 결합 상태로 만들어 주어, 유지보수를 용이하게 하려고 합니다.

public class BeanFactory {
	public Object getBean(String choice) {
		if(choice.equals("samsung")) {
			return new SamsungTV();
		} else if (choice.equals("lg")) {
			return new LgTV();
			
		}
		return null;
	}
	
	
}
