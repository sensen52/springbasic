package com.example.ex00.dependency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Coding {
	// new할 필요없이(단단한 의존 떄문에) 필드주입(@Autowired)
	// WebApplicationContext객체가 서버가 돌아가 실행되면서 이런 어노테이션이 붙어져있는 애들을 처리
	// Coding을 사용하기 위해서 Coding의 필드를 메모리에 올리는 순간 computer도 스프링에서 자동으로 주입
	// 주의할 점은, 생성자랑은 별게로 주입되서, 순환참조(무한루프)시 오류가 발생하지 않기 때문에 StackOverFlow가 발생된다.
	@Autowired
	private final Computer computer; // 코딩이 의존하고 있는 존재
	//final :외부에서 다른값이 오지못하도록 막기(주소가 바뀌면서 오류 발생 할 수 있음)
}
