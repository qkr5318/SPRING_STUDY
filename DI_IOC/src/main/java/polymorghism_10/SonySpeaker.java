package polymorghism_10;

public class SonySpeaker implements Speaker {
	
	
	
	  public SonySpeaker() {
		System.out.println("===> SonySpeaker 객체 생성");
	}
	  
	  
	  @Override
	public void volumeUp() {
		  System.out.println("SonySpeaker --- 소리를 올립니다");
		  
	  }
	
	  
	  @Override
	public void volumeDown() {
		  System.out.println("SonySpeaker --- 소리를 내립니다");
		  
	  }
	  
	  
}
	  
	  
	  
	  

