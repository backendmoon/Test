package com.qwer.qwer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.qwer.qwer.dto.BoardDto;
import com.qwer.qwer.service.BoardService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class BoardController {

	@Autowired
	private BoardService bSer;

	@GetMapping("/board/list")
	public String boardList(HttpSession session, Model model, Integer pageNum) {
		 if(pageNum==null) { pageNum=1;}
			session.getAttribute("mb");
			log.info("=====pageNum:" + pageNum); // 1
			List<BoardDto> bList = bSer.getBoardList(pageNum);
			log.info("====bList:{}", bList);
			log.info("====bList size:{}개", bList.size());
			if (bList != null) {
				return "boardList"; // jsp
			} else {
				return "redirect:/"; // index.jsp
			}
	}
	
	
}
