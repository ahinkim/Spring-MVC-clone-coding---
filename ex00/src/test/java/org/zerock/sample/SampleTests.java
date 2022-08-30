package org.zerock.sample;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zeorck.sample.Restaurant;
import org.zeorck.sample.SampleHotel;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") // 자동완성 기능
@Log4j
public class SampleTests {
	
	@Autowired
	private Restaurant restaurant;
	
	@Autowired
	private SampleHotel hotel;
	
	@Test
	public void testHotel() {
		
		log.info(hotel);
		
	}
	
	@Test
	public void test() {
		System.out.println("test1..............");
		log.info("test1...............");
		log.info(restaurant);
	}
}
