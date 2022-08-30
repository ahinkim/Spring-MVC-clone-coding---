package org.zerock.service;

import java.util.List;

import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;

public interface BoardService {
	
	Long register(BoardVO board); //insert + selectKey 몇 번 글이 등록되었는 지 반환하고 싶을 때
	
	BoardVO get(Long bno); //read
	
	int modify(BoardVO board);
	
	int remove(Long bno);
	
	List<BoardVO> getList();
	
	List<BoardVO> getList(Criteria cri);
	
	int getTotal(Criteria cri);
}
