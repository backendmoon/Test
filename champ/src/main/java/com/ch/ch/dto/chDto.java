package com.ch.ch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class chDto {
	private String champion_name;
	private String championName;
	private String teamposition;
	private String pickTop3;
	private String winTop3;
	private String banTop3;
}
