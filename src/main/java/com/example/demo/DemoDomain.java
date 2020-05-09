package com.example.demo;

public class DemoDomain implements BusinessDomain {

	@Override
	public String getName() {
		return this.getClass().getSimpleName();
	}

}
