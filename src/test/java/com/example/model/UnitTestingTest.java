package com.example.model;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class UnitTestingTest {

	@MockBean
	private UnitTesting unitTesting;

	@Test
	public void checkIntType1Test() {
		when(unitTesting.checkIntType(2)).thenReturn(2);
	}

	@Test
	public void checkIntType2Test() {
		when(unitTesting.checkIntType(3)).thenReturn(2);
	}

	@Test
	public void checkIntType3Test() {
		when(unitTesting.checkIntType(100)).thenReturn(2);
	}

	@Test
	public void checkIntType4Test() {
		when(unitTesting.checkIntType(1)).thenReturn(2);
	}

}
