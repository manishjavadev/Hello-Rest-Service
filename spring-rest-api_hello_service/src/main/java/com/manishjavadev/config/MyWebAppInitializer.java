package com.manishjavadev.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * With the release of Servlet 3.0, we can initialize the Servlet container
 * without web.xml.
 * 
 * Create a container initializer class by extending the
 * AbstractAnnotationConfigDispatcherServletInitializer class as follows.
 * 
 * The AbstractAnnotationConfigDispatcherServletInitializer class, implements
 * the WebApplicationInitializer, is implemented in Servlet 3.0+ environments in
 * order to configure the ServletContext programmatically.
 * 
 * @author Manish
 *
 */
public class MyWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { RootConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { WebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}
}
