package com.xworkz.ganesha.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class InterviewConfigInit extends AbstractAnnotationConfigDispatcherServletInitializer
		implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		Class[] ref = { SpringConfigration.class };
		return ref;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] ref = { SpringConfigration.class };
		return ref;
	}

	

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("created  configureDefaultServletHandling");
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Creating getServletMappings");
		return new String[] {"/"};
	}

}
