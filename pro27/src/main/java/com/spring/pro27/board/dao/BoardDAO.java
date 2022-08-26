package com.spring.pro27.board.dao;

import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import com.spring.pro27.board.vo.ArticleVO;

public interface BoardDAO {
	public List selectAllArticlesList() throws DataAccessException;
	public int insertNewArticle(Map articleMap) throws DataAccessException;
	public ArticleVO selectArticle(int articleNO) throws DataAccessException;
	public void updateArticle(Map articleMap) throws DataAccessException;
}
