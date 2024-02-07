package com.qwer.qwer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.qwer.qwer.dto.BoardDto;

@Mapper
public interface BoardDao {

	List<BoardDto> getBoardList(Map<String, Integer> pageMap);

	@Insert("INSERT INTO BOARD VALUES(NULL,#{b_title},#{b_contents},#{b_writer},DEFAULT,DEFAULT)")
	int insertDummyData(BoardDto bDto);

}
