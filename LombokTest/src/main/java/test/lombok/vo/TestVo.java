package test.lombok.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class TestVo {
	
	private String name;
	private int age;
	
}