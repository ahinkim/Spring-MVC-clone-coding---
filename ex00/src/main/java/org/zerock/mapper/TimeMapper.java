package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
	
	// MyBatis에서 주의해야 할 점: ; 없어야 한다.
	@Select("select sysdate from dual")
	String getTime();
	
	String getTime2();
	
}
