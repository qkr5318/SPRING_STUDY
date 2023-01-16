package com.spring.crud.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.ArticleService;
import com.spring.crud.ArticleVO;

@Service("articleService")
public class ArticleServiceImpl implements ArticleService{
	
	@Autowired
	private ArticleDAO articleDAO;
	@Override
	public ArticleVO selectById(ArticleVO vo) {
		System.out.println("IMPLselectById실행");
		return articleDAO.selectById(vo);
	}

	@Override
	public void insert(ArticleVO vo) {
		System.out.println("IMPLinsert실행");
		articleDAO.insert(vo);
		
	}

	@Override
	public void update(ArticleVO vo) {
		System.out.println("IMPLupdate실행");
		articleDAO.update(vo);
		
	}

	@Override
	public void delete(ArticleVO vo) {
		System.out.println("IMPLdelete실행");
		 articleDAO.delete(vo);
		
	}

}
