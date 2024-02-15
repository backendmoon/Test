package com.ch.ch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ch.ch.dto.chDto;
import com.ch.ch.service.chService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class chController {

	@Autowired
	public chService cSer;

	@GetMapping("/")
	public String champions(Model model) {
		List<chDto> championName = cSer.champions();
		model.addAttribute("championName", championName);
		return "index";
	}

	@PostMapping("/detail")
	public String detail(@RequestParam(name = "champion_name") String championName, Model model, chDto cDto) {
		model.addAttribute("championName", championName);
		String pickrate = cSer.pickrate(cDto);
		model.addAttribute("pickrate", pickrate);
		return "detail";
	}

//	@GetMapping("/ch/detail")
//	public String detail(@RequestParam(name = "champion_name") String chName, Model model, List<chDto> champList) {
//		boolean champ = cSer.pickrate(chName);
//		if (champ) {
//			log.info("====chName", chName);
//			model.addAttribute("chName", chName);
//			return "chDetail";
//		} else {
//			log.info("====실패", chName);
//			return "redirect:/ch";
//		}
//
//	}

	@GetMapping("/ch/rune")
	public String rune() {
		return "chRune";
	}

	@GetMapping("/ch/skill")
	public String skill() {
		return "chSkill";
	}

	@GetMapping("ch/item")
	public String item() {
		return "chItem";
	}

	@GetMapping("/ch/counter")
	public String counter() {
		return "chCounter";
	}
}