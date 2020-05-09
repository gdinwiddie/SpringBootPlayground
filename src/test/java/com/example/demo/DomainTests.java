package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DomainTests {

	@Test
	void testDomainName() {
		BusinessDomain domain = new DemoDomain();
		assertEquals("DemoDomain", domain.getName());
	}

}
