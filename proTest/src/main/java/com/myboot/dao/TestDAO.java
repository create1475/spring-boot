package com.myboot.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.myboot.vo.TestVO;

@Repository("testDAO")
public class TestDAO {
	@Autowired SqlSession sqlSession;
	
	public List listTests() throws DataAccessException {
		List<TestVO> membersList = null;
		membersList = sqlSession.selectList("mapper.member.selectAllMemberList");
		return membersList;
	}
}
