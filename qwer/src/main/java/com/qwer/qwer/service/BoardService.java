package com.qwer.qwer.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwer.qwer.dao.BoardDao;
import com.qwer.qwer.dto.BoardDto;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BoardService {
	@Autowired
	private BoardDao bDao;

	public List<BoardDto> getBoardList(Integer pageNum) {
		// 페이지번호를 limit시작 번호로 변경
		int listCnt = 10;
		int startIdx = (pageNum - 1) * listCnt;
		Map<String, Integer> pageMap = new HashMap<>();
		pageMap.put("listCnt", listCnt);
		pageMap.put("startIdx", startIdx);
		List<BoardDto> bList = bDao.getBoardList(pageMap);
		return bList;
	}
}
