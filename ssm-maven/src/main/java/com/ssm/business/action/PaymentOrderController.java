package com.ssm.business.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ssm.business.service.interfaces.IPaymentOrderInfoSV;

@Controller  
@RequestMapping("/payment")
public class PaymentOrderController {
	private static Logger logger = Logger.getLogger(PaymentOrderController.class);  
	@Autowired
	IPaymentOrderInfoSV service;
	
	@RequestMapping("/showPayment")  
    public String showPayment(HttpServletRequest request,Model model){  
        String channelCode = request.getParameter("channelCode");
        
        model.addAttribute("payment", "00");  
        return "show";  
    }  
}
