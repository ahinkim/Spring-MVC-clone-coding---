package org.zerock.mapper;

import java.util.List;
import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
// Java Config
// @ContextConfiguration(classes = { org.zerock.config.PersistenceConfig.class
// })
@Log4j
public class ReplyMapperTests {

	// 테스트 전에 해당 번호의 게시물이 존재하는지 반드시 확인할 것
	private Long[] bnoArr = { 3862842L, 3862841L, 2031656L, 2031655L, 2031654L };

	@Setter(onMethod_ = @Autowired)
	private ReplyMapper mapper;

	@Test
	public void testCreate() { // 댓글 등록(create) 테스트

		IntStream.rangeClosed(1, 10).forEach(i -> {

			ReplyVO vo = new ReplyVO();

			// 게시물의 번호
			vo.setBno(bnoArr[i % 5]);
			vo.setReply("댓글 테스트 " + i);
			vo.setReplyer("replyer" + i);

			mapper.insert(vo);
		});

	}

	@Test
	public void testRead() { // 댓글 조회(read) 테스트

		Long targetRno = 5L;

		ReplyVO vo = mapper.read(targetRno);

		log.info(vo);

	}

	@Test
	public void testMapper() { //ReplyMapper 타입의 객체가 정상적으로 사용이 가능한지 확인하는 테스트

		log.info(mapper);
	}

	@Test
	public void testDelete() { // 댓글 삭제 테스트

		Long targetRno = 2L;

		mapper.delete(targetRno);
	}

	@Test
	public void testUpdate() { // 댓글 수정 테스트

		Long targetRno = 10L;

		ReplyVO vo = mapper.read(targetRno);

		vo.setReply("Update Reply ");

		int count = mapper.update(vo);

		log.info("UPDATE COUNT: " + count);
	}

	@Test
	public void testList() { // 특정 게시물의 댓글 목록 조회 테스트

		Criteria cri = new Criteria();

		// 3862842L
		List<ReplyVO> replies = mapper.getListWithPaging(cri, bnoArr[0]);

		replies.forEach(reply -> log.info(reply));

	}
	
	@Test
	public void testList2() {

		Criteria cri = new Criteria(2, 10);

		// 3145745L
		List<ReplyVO> replies = mapper.getListWithPaging(cri, 3862842L);

		replies.forEach(reply -> log.info(reply));

	}

	
	


}
