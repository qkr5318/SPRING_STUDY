package com.spring.iamport.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.iamport.model.PaymentVO;
import com.spring.iamport.service.PaymentService;

@RestController
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;
	
	//결제 시작
	@RequestMapping(value ="/payment.do")
	public ModelAndView fwdPaymentPage() {
		System.out.println("==> fwdPaymentpage실행");
		return new ModelAndView("payment");
	}
	
	// 결제 완료
	@RequestMapping(value = "/paymentDone.do")
	public ModelAndView fwdPaymentSuccessPage() {
		System.out.println("==> fwdPaymentSuccessPage실행");
		return new ModelAndView("paymentSuccess");
	}
	
	// 결제 성공
	@RequestMapping(value = "/paymentProcess.do")
	public void paymentDone(@RequestBody PaymentVO vo) {
		System.out.println("==>fwdPaymentDone실행");
		paymentService.insertPaymentSuccess(vo);
	}
	
	// 처음페이지 돌아간다
	@RequestMapping(value = {"/goMain.do", "/"})
	public ModelAndView goMain() {
		System.out.println("==> goMain실행");
		return new ModelAndView("index");
	}
	
	
	
	
}
