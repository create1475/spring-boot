package com.spring.pro27.board.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.spring.pro27.board.vo.ArticleVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO{
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List selectAllArticlesList() throws DataAccessException{
		List<ArticleVO> articlesList = sqlSession.selectList("mapper.board.selectAllArticlesList");
		return articlesList;
	}
	@Override
	public int insertNewArticle(Map articleMap) throws DataAccessException{
		int articleNO = selectNewArticleNO();
		articleMap.put("articleNO", articleNO);
		sqlSession.insert("mapper.board.insertNewArticle",articleMap);
		return articleNO;
	}
	@Override
	public ArticleVO selectArticle(int articleNO) throws DataAccessException{
		return sqlSession.selectOne("mapper.board.selectArticle",articleNO);
				
	}
	
	private int selectNewArticleNO() throws DataAccessException{
		return sqlSession.selectOne("mapper.board.selectNewArticleNO");
	}
	@Override
	public void updateArticle(Map articleMap) throws DataAccessException{
		sqlSession.update("mapper.board.updateArticle",articleMap);
	}
	
	
	
	}

	
