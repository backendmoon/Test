package com.qwer.qwer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.qwer.qwer.dto.MemberDto;
import com.qwer.qwer.service.MemberService;

import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class MemberController {

	@Autowired
	public MemberService mSer;

	@GetMapping("/member/joinfrm")
	public String join() {
		return "join";
	}

	@PostMapping("/member/join")
	public String join(MemberDto jm, Model model, RedirectAttributes rttr) {
		boolean result = mSer.join(jm);
		if (result) {
			rttr.addAttribute("msg", "가입성공");
			log.info("=====회원가입성공");
			return "redirect:/";
		} else {
			model.addAttribute("msg", "가입실패");
			log.info("=====회원가입실패");
			return "join";
		}
	}

	@GetMapping("/member/loginfrm")
	public String login() {
		return "login";
	}

	@PostMapping("/member/login")
	public String login(MemberDto lm, Model model, HttpSession session, RedirectAttributes rttr) {
		MemberDto mb = mSer.login(lm);
		log.info("로그인성공=====mb " + mb);
		if (mb != null) {
			session.setAttribute("mb", mb); // 로그인 성공후 회원정보를 출력위해
			return "redirect:/board/list?pageNum=1";
		} else {
			rttr.addFlashAttribute("msg", "로그인 실패");
			return "redirect:/member/loginfrm";
		}
	}

	@GetMapping("/member/logout")
	public String logout(HttpSession session) {
		session.invalidate(); // 세션에 있는거 삭제
		log.info("=====로그아웃성공");
		return "redirect:/";
	}

	@PostMapping("/member/update")
	public String update(MemberDto um, HttpSession session, Model model) {
		int mb = mSer.updateInfo(um);
		if (mb == 1) {
			log.info("수정결과 -> 성공");
			session.setAttribute("mb", mSer.getMemberInfo(um));
			return "redirect:/board/list?pageNum=1";
		} else {
			log.info("수정결과 -> 실패");
			return "redirect:/board/list?pageNum=1";
		}

	}

	@PostMapping("/member/delete")
	public String delete(MemberDto dm, HttpSession session) {
		int mb = mSer.deleteMember(dm);
		if (mb == 1) {
			log.info("삭제결과 -> 성공");
			session.invalidate(); // 세션에 있는거 삭제
			return "redirect:/";
		} else {
			log.info("삭제결과 -> 실패");
			return "redirect:/board/list?pageNum=1";
		}
	}

}
