package org.jointheleague.api.king.presentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@SpringBootApplication
@Controller
@ResponseStatus(HttpStatus.MOVED_PERMANENTLY)
public class HomeController {

	@GetMapping("/")
	public String home(){
		return "redirect:swagger-ui.html";
	}

}

