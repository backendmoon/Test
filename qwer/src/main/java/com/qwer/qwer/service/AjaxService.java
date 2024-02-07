package com.qwer.qwer.service;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qwer.qwer.dto.MemberDto;

@RestController
public class AjaxService {

	@PostMapping("/send")
	public MemberDto ajax(MemberDto mDto) {
	    mDto.setId("라라라라");
	    mDto.setPw("11231230");
		return mDto;
	}

}
