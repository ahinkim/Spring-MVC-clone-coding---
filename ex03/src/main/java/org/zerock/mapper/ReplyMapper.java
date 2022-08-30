package org.zerock.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyVO;

public interface ReplyMapper {

	public int insert(ReplyVO vo); // 등록

	public ReplyVO read(Long rno); // 조회

	public int delete(Long rno); // 삭제
 
	public int update(ReplyVO reply); // 수정
	
	// 댓글의 목록과 페이징 처리
	public List<ReplyVO> getListWithPaging(@Param("cri") Criteria cri, @Param("bno") Long bno); 

	public int getCountByBno(Long bno); // 전체 댓글의 숫자 파악
}
