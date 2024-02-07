package com.qwer.qwer.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.qwer.qwer.dto.BoardDto;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class BoardDaoTest {

	@Autowired
	private BoardDao bDao;

	@Test
	// @Transactional
	void insertDummyDataTest() {
		BoardDto bDto = new BoardDto();
		for (int i = 0; i < 35; i++) {
			bDto.setB_title("제목" + i).setB_contents("무궁화 꽃이 피었습니다.").setB_writer("cha");
			bDao.insertDummyData(bDto);
		}
	}
}
