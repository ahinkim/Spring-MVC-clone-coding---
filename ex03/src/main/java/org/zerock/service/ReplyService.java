package org.zerock.service;

import java.util.List;

import org.zerock.domain.Criteria;
import org.zerock.domain.ReplyPageDTO;
import org.zerock.domain.ReplyVO;

public interface ReplyService {

	public int register(ReplyVO vo); // 댓글 등록

	public ReplyVO get(Long rno); // 댓글 조회

	public int modify(ReplyVO vo); // 댓글 수정

	public int remove(Long rno); // 댓글 삭제

	public List<ReplyVO> getList(Criteria cri, Long bno);
	
	public ReplyPageDTO getListPage(Criteria cri, Long bno);

}
