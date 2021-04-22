package com.example.demo;

//import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

//import com.example.demo.grpc.HelloWorldClient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MyEmployeeApplicationTests {

//	@Autowired
//	  private HelloWorldClient helloWorldClient;

	  @Test
	  public void testSayHello() {
//	    assertThat(helloWorldClient.sayHello("Linh", "0123456"))
//	        .isEqualTo("Hello Linh 0123456!");
	  }
}
