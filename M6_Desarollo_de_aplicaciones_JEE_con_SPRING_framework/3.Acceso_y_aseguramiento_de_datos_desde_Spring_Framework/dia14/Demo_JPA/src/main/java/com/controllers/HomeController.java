package com.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	private final static Logger logger = LoggerFactory.getLogger(HomeController.class);

	@RequestMapping("/")
	public ModelAndView handleRequest() {
		logger.info("Reenvio a vista home");
		return new ModelAndView("home");
	}
}
