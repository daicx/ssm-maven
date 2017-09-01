package com.saiyaku.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.saiyaku.model.Users;
import com.saiyaku.services.UsersServices;

@Controller
@RequestMapping("/users")
public class UsersController {
	@Autowired
	private UsersServices usersServices;
	@RequestMapping("/showUsers")
	public String showUsers(HttpServletRequest request,Model model) {
		String parameter = request.getParameter("id");
		//Users users = usersServices.getUserById(Integer.parseInt(parameter));
		Users users = usersServices.selectUsersById(Integer.parseInt(parameter));
		model.addAttribute("users", users);
		return "showUsers";
	}
}
