package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	private BusinessDomain bizDomain;

	@Autowired
	public void setBizDomain(BusinessDomain domain) {
		bizDomain = domain;
		System.out.println("*** BusinessDomain set to "+domain.getName());
	}

	public BusinessDomain getBizDomain() {
		return bizDomain;
	}

	@RequestMapping("/bizDomain")
	public String getBusinessDomainName() {
		return "Hello from "+bizDomain.getName();
	}
}