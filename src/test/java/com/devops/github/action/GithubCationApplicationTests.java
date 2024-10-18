package com.devops.github.action;

import com.devops.github.action.controller.DemoController;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
@ExtendWith(MockitoExtension.class)

class GithubCationApplicationTests {


	@Autowired
	private DemoController demoController;


	@Test
	public void helloWorldTestCase() {

		String returnValue = demoController.helloWord();
		assertEquals("<h1>Hello World</h1>", returnValue);
	}

}
