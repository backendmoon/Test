package com.ch.ch.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ch.ch.dto.ChampDto;

@Mapper
public interface ChampDao {

	@Select("select champion_name from list")
	public List<ChampDto> chName();

}
