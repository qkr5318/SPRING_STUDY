package com.spring.iamport.model;

import java.util.Date;

import lombok.Data;


// 간결하고 생산성이 향상된 로직 lomda
@Data
public class PaymentVO {
	
	String imp_uid;
	String merchant_uid;
	int paid_amount;
	String apply_num;
	Date paid_at;

}
