package com.xworkz.Detailes.Configration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Springinit extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getRootConfigClasses ");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Creating getServletConfigClasses");	
		return new Class[] {SpringConfigratin.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("creating getServletMappings");
		return new String[] {"/"};
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("created  configureDefaultServletHandling");
		configurer.enable();
	}


}
