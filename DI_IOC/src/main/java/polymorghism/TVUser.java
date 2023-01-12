package polymorghism;


// 결합도(Coupling)란 하나의 클래스가 다른 클래스와 얼마나 많이 연결되어 있는지를 나타내는 표현이며,
// 결합도(Coupling)가 높은 프로그램은 유지보수가 비교적 어렵습니다.
// 아래의 예시에서 SamsungTv와 LgTv는 메소드 시그니처(signature)가 다르므로, 
// TVUSER 코드 대부분을 수정해야 TV를 교체할 수 있었습니다. 즉, TV 교체를 결정하기가 쉽지 않은 상황
public class TVUser {

	public static void main(String[] args) {
		
		LgTV jangnaratv = new LgTV();
		jangnaratv.TurnOn();
		jangnaratv.soundUp();
		jangnaratv.soundDown();
		jangnaratv.TurnOff();
		
//		SamsungTV jangnaratv = new SamsungTV();
//		jangnaratv.PowerOn();
//		jangnaratv.volumUp();
//		jangnaratv.volumDown();
//		jangnaratv.PowerOff();
//		
//		
	}
}
