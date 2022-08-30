package org.zeorck.sample;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

//필드 주입/세터 주입/생성자 주입
@Component
@ToString
@RequiredArgsConstructor // 생성자의 자동 주입
public class SampleHotel {

	private final Chef chef;

	
}
