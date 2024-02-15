package com.ch.ch.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ch.ch.dto.chDto;

@Mapper
public interface chDao {

	@Select("select champion_name from champlist")
	List<chDto> champions();

	String pickrate(chDto cDto);

//	boolean pickrate(String chName);

//	String winrate(chDto cDto);
//
//	String pickrate(chDto cDto);
}
