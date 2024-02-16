package com.ch.ch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

	@GetMapping("/detail/{championName}")
	public String detail(@PathVariable(name = "championName") String championName, Model model, chDto cDto) {
		log.info(championName);
		List<chDto> linePick = cSer.pw(cDto);
		if (linePick != null) {
			model.addAttribute("linePick", linePick);
			log.info("@@라인, 픽률 -> " + linePick);
			return "detail";
		} else {
			return "redirect:/";
		}
	}

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