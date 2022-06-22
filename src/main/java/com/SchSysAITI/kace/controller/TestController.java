package com.SchSysAITI.kace.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping("/test")
	public String myApp() {
		return "<h1>Happy Coding Today</h1>";
	}
}
