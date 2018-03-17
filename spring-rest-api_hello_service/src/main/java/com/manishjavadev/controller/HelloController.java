package com.manishjavadev.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Manish
 *
 */
@Controller
public class HelloController {

	// Method1
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String sayHello(Model model) {
		model.addAttribute("message", "Hello Spring MVC! Manishjavadev.com");

		DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate date = LocalDate.now();
		model.addAttribute("date", date.format(formatter));

		return "index";
	}

	// Method2
	@ResponseBody
	@RequestMapping(value = { "/testhello" }, method = RequestMethod.GET)
	public String testHello(Model model) {
		return "Hello Manish";
	}
}
