package com.manishjavadev.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Manish
 *
 */
@RestController
@RequestMapping("/helloService")
public class HelloRestController {

	@RequestMapping(value = { "/ping" }, method = RequestMethod.GET, produces = { MediaType.APPLICATION_XML_VALUE,
			MediaType.APPLICATION_JSON_VALUE })
	public Boolean ping() {
		return true;
	}

	@RequestMapping(value = { "/helloPing" }, method = RequestMethod.GET)
	public String helloPing() {
		return "Hello Java Developement Blog";
	}
}
