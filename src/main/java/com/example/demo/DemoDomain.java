package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoDomain implements BusinessDomain {

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

}
