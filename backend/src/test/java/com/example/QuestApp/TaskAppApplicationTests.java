package com.example.QuestApp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("test")  // <-- add this
class TaskAppApplicationTests {

	@Test
	void contextLoads() {
	}
}
