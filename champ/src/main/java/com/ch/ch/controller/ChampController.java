package com.ch.ch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ch.ch.service.ChampService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class ChampController {

	@Autowired
	public ChampService cSer;

	@GetMapping("/")
	public String home() {
		return "index";
	}

	@PostMapping("/detail")
	public String getChName(@RequestParam("chName") String chName, Model model) {
		model.addAttribute("chName", chName);
		return "detail";
	}

	@GetMapping("/counter")
	public String counter() {
		return "counter";
	}

	@GetMapping("/rune")
	public String rune() {
		return "rune";
	}

	@GetMapping("/item")
	public String item() {
		return "item";
	}

	@GetMapping("/skill")
	public String skill() {
		return "skill";
	}
}