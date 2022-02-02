package com.app.dev;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
public class Welcome {

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome to Spring boot Web project";
	}
	
}