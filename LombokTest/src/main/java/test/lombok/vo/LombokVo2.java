package test.lombok.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LombokVo2 {
	
		private String name;
		private int age;
		
		
		public LombokVo2(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		
		
}
