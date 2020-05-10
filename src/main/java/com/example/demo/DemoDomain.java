package com.example.demo;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component
public class DemoDomain implements BusinessDomain {

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}
	
	@PostConstruct
	public void atPostConstruct() {
		System.out.println("*** "+getName()+" has been constructed");
	}

}
