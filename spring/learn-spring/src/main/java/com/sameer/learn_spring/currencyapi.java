package com.sameer.learn_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class currencyapi {
	
	@Autowired
	private Currencycoverter curr;
	
	@RequestMapping("/currency")
	public Currencycoverter getname()
	{
		return curr;
	}
	
	

}
