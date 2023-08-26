package com.example.DemoForJenkins;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.example.model.UnitTesting;

@SpringBootTest
class DemoForJenkinsApplicationTests {

	@MockBean
	private UnitTesting unitTesting;
	
	@Test
	void contextLoads() {
	}

}
