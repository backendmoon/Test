package com.qwer.qwer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qwer.qwer.dao.MemberDao;
import com.qwer.qwer.dto.MemberDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberService {
	@Autowired
	public MemberDao mDao;

	public boolean join(MemberDto jm) {
		return mDao.join(jm);
	}

	public MemberDto login(MemberDto lm) {
		boolean login = mDao.login(lm);
		if (login) {
			log.info("로그인성공");
			return mDao.getMemberInfo(lm);
		} else {
			log.info("로그인실패");
			return null;
		}
	}

	public int updateInfo(MemberDto um) {
		return mDao.updateInfo(um);
	}

	public MemberDto getMemberInfo(MemberDto um) {
		return mDao.getMemberInfo(um);
	}

	public int deleteMember(MemberDto dm) {
		return mDao.deleteMember(dm);
	}

}
