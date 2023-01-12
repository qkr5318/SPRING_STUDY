package polymorghism_6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;



public class TVUser {

	public static void main(String[] args) {
	
		// 1. Spring 컨테이너를 구동합니다.
		AbstractApplicationContext factory = new GenericXmlApplicationContext("applicationContext.xml");
		
		
		// 2. Spring 컨테이너로 부터 필요한 객체를 요청(Look Up)합니다.
			TV tv1 = (TV)factory.getBean("tv");
			TV tv2 = (TV)factory.getBean("tv");
			TV tv3 = (TV)factory.getBean("tv");
			
	// pom.xml에 bean에 기술된 범위값이 singleton으로 객체 요청이 여러개이더라도 생성되는 객체는 하나이다.	
			
		// 3. Spring 컨테이너를 종료합니다.
		factory.close();
	
	}

}
