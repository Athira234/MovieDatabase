package com.entlogics.moviedb.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {

	@RequestMapping("/")
	public String welcome() {
		System.out.println("Inside Welcome method");

		return "welcome";
	}
}
