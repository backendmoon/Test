package com.qwer.qwer.dto;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardDto {
	private int b_num;
	private String b_title; 
	private String b_contents; 
	private String b_writer;   //
	private String m_name;  //작성자이름 
	private LocalDateTime b_date;   //jdk1.8추가   MySQL: Date---  String 서로호환
	//private Timestamp b_date;//old, 날짜시간   // Date, String 서로호환
	private String b_views;
	
}
