package com.yinkcore.api_server;


import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ExtendWith(MockitoExtension.class)
class ApiServerApplicationTests {


	@Test
	@DisplayName("Mockito Verify Interactions Test")
	void testMockitoVerifyInteraction(){

		List<String> mock = mock(List.class);

		mock.add("1");
		mock.clear();

		verify(mock).add("1");
		verify(mock).clear();
	}

	@Test
	@DisplayName("mockito stubbing test")
	void testMockitoStubbing(){

		LinkedList mock = mock(LinkedList.class);

		when(mock.get(0)).thenReturn("correct");
		// when(mock.get(1)).thenThrow(new RuntimeException("you are wrong!"));

		System.out.println(mock.get(0));
		// System.out.println(mock.get(1));
		System.out.println(mock.get(999));

	}

	@Test
	@DisplayName("test contextLoads")
	void contextLoads() {	

		assertThat("The lord of the Ring")
		.isNotNull().startsWith("The")
		.containsIgnoringCase("Lord")
		.endsWithIgnoringCase("ring");

	}

}
