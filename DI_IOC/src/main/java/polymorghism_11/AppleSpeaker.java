package polymorghism_11;

public class AppleSpeaker implements Speaker {
	
	public AppleSpeaker() {
		System.out.println("===> AppleSpeaker 객체 생성");
	}
	

	@Override
	public void volumeUp() {
	System.out.println("AppleSpeaker --- 소리를 올립니다.");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker --- 소리를 내립니다.");
		
	}

}
