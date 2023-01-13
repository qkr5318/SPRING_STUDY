package com.spring.iamport.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import com.spring.iamport.model.PaymentVO;

// DB로 인설트하는 클래서 
@Repository
public class PaymentDAO {
	


	private static SqlSessionFactory sqlMapper;


	
	private static SqlSessionFactory getInstance() {
		if (sqlMapper == null) {
			String resource = "mybatis-config.xml";
			try {
				Reader reader = Resources.getResourceAsReader(resource);
				sqlMapper = new SqlSessionFactoryBuilder().build(reader);
				reader.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		return sqlMapper;
	}
	 public void insertPaymentSuccess(PaymentVO vo) {
		 sqlMapper = getInstance();
		SqlSession session = sqlMapper.openSession();
		 session.insert("payment.insertPaymentSuccess", vo);
		 session.commit();
	 }
	
	}
