package com.yinkcore.api_server;


import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ApiServerApplicationTests {

	@Test
	@DisplayName("test contextLoads")
	void contextLoads() {	
		assertThat("young").asString().isEqualToIgnoringCase("Young");
	}

}
