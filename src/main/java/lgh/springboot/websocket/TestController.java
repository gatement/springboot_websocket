package lgh.springboot.websocket;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class TestController {

	@GetMapping("/hello")
	public String hello() {
		log.info("GET /hello");
		return "[" + String.valueOf(System.currentTimeMillis()) + "] HelloWorld";
	}

}
