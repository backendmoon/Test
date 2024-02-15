package com.ch.ch.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ch.ch.dao.chDao;
import com.ch.ch.dto.chDto;

@Service
public class chService {

	@Autowired
	public chDao cDao;

	public List<chDto> champions() {
		return cDao.champions();
	}

	public List<chDto> pickrate() {
		return cDao.pickrate();
	}

//	public boolean pickrate(String chName) {
//		return cDao.pickrate(chName);
//	}

//	public String winrate() {
//		return cDao.winrate(null);
//	}

}
