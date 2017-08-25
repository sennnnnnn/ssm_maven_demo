package com.ssm.test;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

import com.ssm.business.service.interfaces.IPaymentOrderInfoSV;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class PfbTest {
	private static Logger logger = Logger.getLogger(PfbTest.class);  
	@Autowired
	IPaymentOrderInfoSV service;
	
	@Test
	public void test() {
		
		try {
			int count = service.queryUserRedeemCount(812);
			logger.info("count is " + count);
		} catch (Exception e) {
			logger.error("error is  ====",e);
		}
	}

}
