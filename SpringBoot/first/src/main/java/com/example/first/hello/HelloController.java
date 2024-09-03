package com.example.first.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

	@GetMapping("/board")
	@ResponseBody
	public String board() {
		return "Board Test";
	}
}