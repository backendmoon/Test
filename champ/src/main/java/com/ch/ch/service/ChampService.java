package com.ch.ch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.ch.dao.ChampDao;
import com.ch.ch.dto.ChampDto;

@Service
public class ChampService {

	@Autowired
	public ChampDao cDao;

	public List<ChampDto> getChName() {
		return cDao.chName();
	}

}
