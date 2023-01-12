package polymorghism_2;


// interface는 기능 명세서 이다. 이 뜻은 이 기능을 따라야 한다는 뜻 
// interface를 두는 이유는 개발 코드를 수정하지 않고 사용하는 객체를 변경할 수 있도록 하기위해서 이다
// interface는 하나의 객체가 아니라 여러 개체들과 사용이 가능하다.
// 그러므로 어떤 객체를 사용하느냐에 따라서 실행 내용과 리턴값이 다를 수 있다
public interface TV {
	// interface는 상수필드와 추상메소드만을 구성멤버로 가진다
	
	
	// interface는 상수 필드 선언만 가능하다
	// 또한 인스턴스나 정적 필드를 선언할 수 없다
	//하지만 상수 필드 선언은 가능하다 단, 상수는 인터페이스에 고정된 값으로 실행 시에 데이터를 바꿀수 없다
	// 인터페이스 상수는 반드시 선언과 동시에 초기값을 지정해 준다.
	// public int MAX_VOLUME = 10; 상수이름은 대문자로 작성 단어와 단어의 구성되어있으면 "_"언더바 사용
	
	// interface는 추상 메소드로 선언한다.
	void PowerOn();

	void PowerOff();

	void volumUp();

	void volumDown();

}