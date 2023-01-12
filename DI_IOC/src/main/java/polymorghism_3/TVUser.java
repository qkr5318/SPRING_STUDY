package polymorghism_3;

public class TVUser {
	
	// polymorghsism 팩키지에 있는 객체들은 interface TV에 기반하여 객체를 생성해 LGTV를 SAMSUNGTV로 교체할때 다 바꿔줘야하는 불편함이 있는데
	// polymorghism2 팩키지에 있는 객체들은 interface TV를 기반으로 하여 객체를 생성해 LGTV와 SAMSUNGTV를 교체를 쉽게 교체할 수있다 이게 중요
	
	//이번에는 Factory  패턴을 이용하여, 비교적 손쉽게 사용자가 TV를 선택 교체할 수 있도록 합니다.

	public static void main(String[] args) {
		BeanFactory factory = new BeanFactory();
		TV jangnaratv = (TV)factory.getBean(args[0]);
		jangnaratv.PowerOn();
		jangnaratv.volumUp();
		jangnaratv.volumDown();
		jangnaratv.PowerOff();
	}

}
