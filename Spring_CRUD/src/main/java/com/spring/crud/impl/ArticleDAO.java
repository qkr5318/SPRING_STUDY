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
      this.mybatis = mybatis;
   }
   
   public void insert(ArticleVO vo) {
      mybatis.insert("ArticleDAO.insert",vo);
   }
   
   public ArticleVO selectById(ArticleVO vo) {
      return (ArticleVO)mybatis.selectOne("ArticleDAO.selectById",vo);
   }
   
   // 최신글 업데이트
   public void update(ArticleVO vo) {
      mybatis.update("ArticleDAO.update",vo);
   }
   
   // 최신글 삭제
   public void delete(ArticleVO vo) {
      mybatis.delete("ArticleDAO.delete", vo);
   }
}