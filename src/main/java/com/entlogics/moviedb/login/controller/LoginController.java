package com.entlogics.moviedb.login.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.entlogics.moviedb.login.entities.Login;
import com.entlogics.moviedb.user.entities.User;
import com.entlogics.moviedb.user.service.IUserService;

@Controller
public class LoginController {

	@Autowired
	IUserService userService;

	@RequestMapping(value = "/login")
	public String showLogin(Model model) {
		Login login = new Login();
		model.addAttribute("login", login);
		return "login-form";
	}

	@RequestMapping(value = "/loginprocess")
	public String loginProcess(@ModelAttribute("login") Login login, Model model) {
		System.out.println("Inside loginProcess() in LoginController");
		User user = userService.validateUser(login);
		if (null != user) {

			String role = user.getRole();
			System.out.println("User's Role=" + role);
			if (role.equals("USER")) {
				model.addAttribute("name", user.getFirstName());
				model.addAttribute("user",user);
				System.out.println("Role=" + user.getRole());
				return "userpage";
			} else {
				model.addAttribute("name", user.getFirstName());
				return "adminpage";
			}

		}

		else {

			model.addAttribute("message", "Username or Password is wrong!!");
			return "error";
		}

	}
	@RequestMapping(value = "/logout")
	public String logout() {
	
		return "logged-out";
	}
}