package com.qwer.qwer.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.qwer.qwer.dto.MemberDto;

@Mapper
public interface MemberDao {

	@Insert("INSERT INTO TEST VALUES(#{id}, #{pw}, \"이름\")")
	boolean join(MemberDto jm);

	@Select("SELECT COUNT(*) FROM TEST WHERE ID=#{id} AND PW=#{pw}")
	boolean login(MemberDto lm);

	@Select("SELECT * FROM TEST WHERE ID=#{id}")
	MemberDto getMemberInfo(MemberDto gm);

	@Update("UPDATE TEST SET NAME=#{name} WHERE ID=#{id}")
	int updateInfo(MemberDto um);

	@Delete("DELETE FROM TEST WHERE ID=#{id} AND PW=#{pw}")
	int deleteMember(MemberDto dm);
}
