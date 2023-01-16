package com.spring.crud.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.crud.ArticleVO;

@Repository
public class ArticleDAO {
   
   
   // 마이바티스 템플릿 활용
   private SqlSessionTemplate mybatis;
   
   // 의존주입
   @Autowired
   public ArticleDAO(SqlSessionTemplate mybatis) {
	   System.out.println("DAOArticleDAo실행");
      this.mybatis = mybatis;
   }
   
   public void insert(ArticleVO vo) {
	   System.out.println("DAOinsert실행");
      mybatis.insert("ArticleDAO.insert",vo);
   }
   
   public ArticleVO selectById(ArticleVO vo) {
	   System.out.println("DAOseletById실행");
      return (ArticleVO)mybatis.selectOne("ArticleDAO.selectById",vo);
   }
   
   // 최신글 업데이트
   public void update(ArticleVO vo) {
	   System.out.println("DAOupdate실행");
      mybatis.update("ArticleDAO.update",vo);
   }
   
   // 최신글 삭제
   public void delete(ArticleVO vo) {
	   System.out.println("DAOdelete실행");
      mybatis.delete("ArticleDAO.delete", vo);
   }
}