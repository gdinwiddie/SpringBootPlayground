package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class DemoApplicationTests {

	@Test
	void contextLoads(@Autowired WebTestClient webClient) {
        webClient.get().uri("/bizDomain").exchange().expectStatus().isOk().expectBody(String.class).isEqualTo("Hello from DemoDomain");
	}

}
