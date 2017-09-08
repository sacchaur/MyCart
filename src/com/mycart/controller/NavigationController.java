package com.mycart.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NavigationController {

	@RequestMapping("/login")
	protected ModelAndView login(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		return new ModelAndView("login");
	}

	@RequestMapping("/signup")
	protected ModelAndView signup(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {

		return new ModelAndView("signup");
	}

	@RequestMapping("/getItem")
	protected ModelAndView getItem(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		return new ModelAndView("getItem");
	}

	@RequestMapping("/adminPage")
	protected ModelAndView showAdminPage(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		return new ModelAndView("adminPage");
	}
	
	@RequestMapping("/addProduct")
	protected ModelAndView showAddProduct(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		return new ModelAndView("addProduct");
	}
	
	@RequestMapping("/updateProduct")
	protected ModelAndView updateProduct(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		return new ModelAndView("updateProduct");
	}

}
