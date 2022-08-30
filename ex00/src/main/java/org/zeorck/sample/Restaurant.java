package org.zeorck.sample;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

// 주입하는 3가지 방식
// Setter 주입: @Setter
// 생성자 주입: @AllArgsConstructor
// 필드 주입: @Autowired

@Component
@ToString
//@AllArgsConstructor
@RequiredArgsConstructor
public class Restaurant {
	
//	@Autowired //chef라는 객체를 연결(주입)해달라고 부탁하는 것
//	@Setter(onMethod_ = {@Autowired} ) 
	private final Chef chef;
}
