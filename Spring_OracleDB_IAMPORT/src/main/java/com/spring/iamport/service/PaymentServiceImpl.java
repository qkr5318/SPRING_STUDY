package com.spring.iamport.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.iamport.dao.PaymentDAO;
import com.spring.iamport.model.PaymentVO;

// inerface인 PaymentService에 구현 클래스
@Service("paymentService")
public class PaymentServiceImpl implements PaymentService{

	// 인스턴스를 만들지않고 객체사용
	@Autowired
	private PaymentDAO dao;
	
	
	@Override
	public void insertPaymentSuccess(PaymentVO vo) {
		System.out.println("==> insertPaymentSuccess실행");
		dao.insertPaymentSuccess(vo);
		
		
	}

}
