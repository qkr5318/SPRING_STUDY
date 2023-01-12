package test.lombok.service;

import org.springframework.stereotype.Service;

import test.lombok.vo.LombokVo1;
import test.lombok.vo.LombokVo2;
import test.lombok.vo.LombokVo3;

@Service
public class HomeService {
	public void backHome() {
		System.out.println("쿼카 힘내~");
		
		LombokVo1 vo1 = new LombokVo1();
		vo1.setName("쿼카");
		vo1.setAge(29);
		System.out.println(vo1.getName() + "님의 나이는 한살줄여서" + vo1.getAge() + "입니다!");
		
		LombokVo2 vo2 = new LombokVo2("김희선", 30);
				System.out.println(vo2.getName() + "님의 나이는 한살줄여서" + vo2.getAge() + "입니다!");
				
				// @Builder는 Builder 패턴을 사용할 수 있도록 코드를 생성해 줍니다.
				// 이것음 new LombokVo3().setName().setAge()와 같이
				// 체이닝을 할 수 있는 코드릴 생성해 줍니다.
				LombokVo3 vo3 = LombokVo3.builder()
									.age(35)
									.name("김연아")
									.build();
				System.out.println(vo3.getName() + "님의 나이는" + vo3.getAge() + "입니다");
	}
}
