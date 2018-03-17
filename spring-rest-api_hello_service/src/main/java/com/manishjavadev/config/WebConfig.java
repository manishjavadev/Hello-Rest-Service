package com.manishjavadev.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

/**
 * Create a web @Configuration class annotated with @EnableWebMvc
 * and @ComponentScan as follows.
 * 
 * The @EnableWebMvc enables default Spring MVC configuration and provides the
 * functionality equivalent to <mvc:annotation-driven/> element in XML based
 * configuration.
 * 
 * The @ComponentScan scans the stereotype annotations (@Controller, @Service
 * etc...) in a package specified by basePackages attribute.
 * 
 * 
 * @author Manish
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.manishjavadev.controller" })
public class WebConfig extends WebMvcConfigurerAdapter {

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

}
