package com.ch.ch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class chDto {
	private String champion_name;
	private String teamposition;

	private String matchid;
	private int gameduration;
	private String riotidgamename;
	private String riotidtagline;
	private int participantid;
	private String championName;
	private String win;
	private String win_percentage;
	private String pick_percentage;
	private String skill_tree;
	private String tier1;
}
