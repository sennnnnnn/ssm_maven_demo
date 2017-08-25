package com.ssm.business.service.interfaces;

import org.apache.ibatis.annotations.Param;

public interface IPaymentOrderInfoSV {

    int queryUserRedeemCount(@Param("userId") long userId);
}
