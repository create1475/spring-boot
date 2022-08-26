package com.spring.pro27.member.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.spring.pro27.member.vo.*;

public interface MemberDAO {
	
	public List selectAllMemberList() throws DataAccessException;
	public int insertMember(MemberVO memberVO)throws DataAccessException;
	public int deleteMember(String id) throws DataAccessException;
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException;
	public int insertNewArticle(Map articleMap) throws DataAccessException;
}
