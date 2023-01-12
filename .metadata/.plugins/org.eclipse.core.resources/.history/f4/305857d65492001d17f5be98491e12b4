package test.lombok.vo;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter @Data
public class LombokVo3 {
	
		private String name;
		private int age;
		
		// @Builder는 Builder 패턴을 사용할 수 있도록 코드를 생성해 줍니다.
		// 이것음 new LombokVo3().setName().setAge()와 같이
		// 체이닝을 할 수 있는 코드릴 생성해 줍니다.
		@Builder
		public LombokVo3(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
}
