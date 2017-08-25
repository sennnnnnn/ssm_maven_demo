package com.ssm.business.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.business.service.interfaces.IPaymentOrderInfoSV;
import com.ssm.pospMapper.PFBPAYMENTORDERINFODOMapper;

@Service
public class PaymentOrderInfoSVImpl implements IPaymentOrderInfoSV {

	@Autowired
	PFBPAYMENTORDERINFODOMapper mapper;

	public int queryUserRedeemCount(long userId) {
		
		return mapper.queryUserRedeemCount(userId);
	}

}
