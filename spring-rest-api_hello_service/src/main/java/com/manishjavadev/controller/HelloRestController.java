package com.manishjavadev.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manish
 *
 */
@RestController
public class HelloRestController {

	@RequestMapping(value = { "/ping" }, method = RequestMethod.GET)
	public boolean ping() {
		return true;
	}

	@RequestMapping(value = { "/testhello" }, method = RequestMethod.GET)
	public String testHello() {
		return "Hello Java Developement Blog";
	}
}
